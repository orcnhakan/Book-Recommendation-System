package yazlab1;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database {

    private String k_adi = "root";
    private String parola = "";
    private String Db_name = "demo";
    private String host = "localhost";
    private int port = 3306;
    private final String url = "jdbc:mysql://" + host + ":" + port + "/" + Db_name + "?useUnicode=true&characterEncoding=utf8";

    private Connection connection = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;

    public Database() {
        try {
            connection = (Connection) DriverManager.getConnection(url, k_adi, parola);
            System.out.println("baglantı basarılı");
        } catch (SQLException ex) {
            System.out.println("bağlantı basarisiz");
        }
    }

    public boolean girisYap(String kullanici_adi, String key) {

        String sorgu = "Select * from users where user_name = ? and password = ?";
        try {
            preparedStatement = connection.prepareStatement(sorgu);
            preparedStatement.setString(1, kullanici_adi);
            preparedStatement.setString(2, key);

            ResultSet rs = preparedStatement.executeQuery();

            return rs.next();

        } catch (SQLException ex) {

        }
        return false;
    }

    public ArrayList<Users> bringRatings() {
        ArrayList<Users> users = new ArrayList();

        int userId;
        int rating, yearOfP;
        String ISBN, bookName, author, publisher, imageUrlS;
        Users tempUser;
        try {
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * from ratings INNER JOIN books USING(ISBN)");

            while (rs.next()) {
                userId = rs.getInt("User-ID");
                ISBN = rs.getString("ISBN");
                rating = rs.getInt("Book-Rating");
                bookName = rs.getString("Book-Title");
                author = rs.getString("Book-Author");
                yearOfP = rs.getInt("Year-Of-Publication");
                publisher = rs.getString("Publisher");
                imageUrlS = rs.getString("Image-URL-L");

                tempUser = new Users(userId);
                Kitaplar tempBook = new Kitaplar(ISBN, bookName, author, yearOfP, publisher, imageUrlS);
                tempUser.addRating(tempBook, rating);
                users.add(tempUser);
            }

            rs.close();
            statement.close();

        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        }

        return users;
    }

    public String getBookUrl(String ISBN) {
        String url = null;
        System.out.println(ISBN);
        try {
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT `Image-URL-S` from books WHERE ISBN=" + ISBN);
            System.out.println(ISBN);

            while (rs.next()) {
                url = rs.getString(1);
                System.out.println(url);
            }

            rs.close();
            statement.close();

        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        }
        return url;

    }

    public ArrayList<Kitaplar> kitaplarigetir() {

        ArrayList<Kitaplar> kitap = new ArrayList<>();

        try {
            statement = connection.createStatement();
            String sorgu = "Select * from books";
            ResultSet rs = statement.executeQuery(sorgu);
            while (rs.next()) {

                String kitapadi = rs.getString("Book-Title");
                String yazaradi = rs.getString("Book-Author");
                int yayinyili = rs.getInt("Year-Of-Publication");
                String yayinevi = rs.getString("Publisher");
                String ISBN = rs.getString("ISBN");
                String imageUrlS = rs.getString("Image-URL-L");
                kitap.add(new Kitaplar(ISBN, kitapadi, yazaradi, yayinyili, yayinevi, imageUrlS));
            }

            rs.close();
            statement.close();

            return kitap;
        } catch (SQLException ex) {
            return null;
        }

    }

    public int bringUserID(String user_name, String password) {
        try {
            statement = connection.createStatement();
            String sorgu = "Select `User-ID` from users WHERE `user_name`=\"" + user_name + "\" AND `password`=\"" + password + "\"";
            

            System.out.println("bring Sorgu : \n" + sorgu);

            ResultSet rs = statement.executeQuery(sorgu);
            int userId = 0;
            while (rs.next()) {
                userId = rs.getInt("User-ID");
                
            }

            System.out.println("bringUser : " + userId);
            rs.close();
            statement.close();

            return userId;
        } catch (SQLException ex) {
            return 0;
        }
    }

    public ArrayList<Users> kullaniciGetir() {

        ArrayList<Users> user = new ArrayList<>();

        try {
            statement = connection.createStatement();
            String sorgu = "Select * from users";
            ResultSet rs = statement.executeQuery(sorgu);

            while (rs.next()) {

                String kullaniciAdi = rs.getString("user_name");
                int kullaniciİd = rs.getInt("User-ID");
                String yas = rs.getString("Age");
                String lokasyon = rs.getString("Location");
                String password = rs.getString("password");

                user.add(new Users(kullaniciİd, kullaniciAdi, lokasyon, yas, password));
            }
            System.out.println("Database");
            System.out.println("user 0 : " + user.get(0).getKullaniciİd() + " age : " + user.get(0).getYas());

            rs.close();
            statement.close();
            return user;

        } catch (SQLException ex) {
            return null;
        }
    }

    public String getMaxUserId() {
        try {
            String get_max = "SELECT MAX(`user-id`) as max_user FROM users";
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(get_max);
            String max_id = null;
            while (rs.next()) {
                max_id = rs.getString("max_user");
                break;
            }
            return max_id;

        } catch (SQLException ex) {
            System.out.println(ex.getSQLState());
            return null;
        }
    }

    // SELECT * from (SELECT ISBN, AVG(`Book-Rating`) average FROM ratings GROUP BY ISBN) t JOIN (SELECT ISBN, COUNT(*) freq FROM 
    // ratings GROUP BY ISBN) t2 USING (ISBN) where freq>3 ORDER BY average DESC LIMIT 10
    public ArrayList<Kitaplar> getHighScoreBooks() {
        String sorgu = "SELECT books.* FROM (SELECT * from (SELECT ISBN, AVG(`Book-Rating`) average FROM ratings GROUP BY ISBN) t JOIN (SELECT ISBN, COUNT(*) freq FROM ratings GROUP BY ISBN) t2 USING (ISBN) where freq>3) t3 JOIN books where t3.ISBN=books.ISBN ORDER BY average DESC LIMIT 10";

        int yearOfP;
        String ISBN, bookName, author, publisher, imageUrlS;
        Kitaplar tempBook;
        ArrayList<Kitaplar> highScoreBooks = new ArrayList<>();
        try {
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sorgu);

            while (rs.next()) {
                ISBN = rs.getString("ISBN");
                bookName = rs.getString("Book-Title");
                author = rs.getString("Book-Author");
                yearOfP = rs.getInt("Year-Of-Publication");
                publisher = rs.getString("Publisher");
                imageUrlS = rs.getString("Image-URL-L");

                tempBook = new Kitaplar(ISBN, bookName, author, yearOfP, publisher, imageUrlS);
                highScoreBooks.add(tempBook);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return highScoreBooks;
    }

    public ArrayList<Kitaplar> getMostVotedTenBooks() {
        String sorgu = "SELECT freq, books.* "
                + "FROM (SELECT ISBN, COUNT(*) freq FROM ratings GROUP BY ISBN ORDER BY freq DESC) t "
                + "JOIN books WHERE t.ISBN=books.ISBN LIMIT 10";

        int frequency, yearOfP;
        String ISBN, bookName, author, publisher, imageUrlS;
        Kitaplar tempBook;
        ArrayList<Kitaplar> mostVotedBooks = new ArrayList<>();
        try {
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sorgu);

            while (rs.next()) {
                frequency = rs.getInt("freq");
                ISBN = rs.getString("ISBN");
                bookName = rs.getString("Book-Title");
                author = rs.getString("Book-Author");
                yearOfP = rs.getInt("Year-Of-Publication");
                publisher = rs.getString("Publisher");
                imageUrlS = rs.getString("Image-URL-L");

                tempBook = new Kitaplar(ISBN, bookName, author, yearOfP, publisher, imageUrlS, frequency);
                mostVotedBooks.add(tempBook);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mostVotedBooks;
    }

    public Users getCurrentUserRatings(int userId) {

        Users currentUser = new Users(userId);
        int rating, yearOfP;
        String ISBN, bookName, author, publisher, imageUrlS;
        Kitaplar tempBook;

        try {
            String sorgu = "SELECT t.`Book-Rating`, books.* "
                    + "FROM (SELECT * FROM `ratings` "
                    + "WHERE `User-ID`=" + userId + " ) t JOIN books WHERE books.ISBN=t.ISBN";
            
            System.out.println(sorgu);
            System.out.println(userId);

            // SELECT * FROM (SELECT ISBN, COUNT(*) freq FROM 
            // ratings GROUP BY ISBN ORDER BY freq DESC LIMIT 10) t JOIN books WHERE t.ISBN=books.ISBN
            
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sorgu);

            while (rs.next()) {

                ISBN = rs.getString("ISBN");
                rating = rs.getInt("Book-Rating");
                bookName = rs.getString("Book-Title");
                author = rs.getString("Book-Author");
                yearOfP = rs.getInt("Year-Of-Publication");
                publisher = rs.getString("Publisher");
                imageUrlS = rs.getString("Image-URL-L");
                tempBook = new Kitaplar(ISBN, bookName, author, yearOfP, publisher, imageUrlS);
                currentUser.addRating(tempBook, rating);
            }

            rs.close();
            statement.close();

        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        }

        return currentUser;

    }

    public void kullaniciKayitYap(int id, String yas, String lokasyon, String username, String password) {

        try {
            statement = connection.createStatement();
            String sorgu = "Insert Into users(`User-ID`,`Location`,`Age`,`user_name`,`password`) VALUES(" + "'" + id + "'," + "'" + lokasyon + "'," + "'" + yas + "'," + "'" + username + "'," + "'" + password + "'" + ")";
            System.out.println(sorgu);
            statement.executeUpdate(sorgu);
        } catch (SQLException ex) {

        }
    }

    public void kitapKayit(int userId, HashMap<String, Integer> ratingMap) {
        try {
            String ISBN;
            int rating;
            statement = connection.createStatement();
            for (Map.Entry<String, Integer> entry : ratingMap.entrySet()) {
                ISBN = entry.getKey();
                rating = entry.getValue();
                String sorgu = "Insert Into ratings(`User-ID`,`ISBN`,`Book-Rating`) VALUES(" + "'" + userId + "'," + "'" + ISBN + "'," + "'" + rating + "')";
                statement.executeUpdate(sorgu);
            }
            statement.close();
        } catch (SQLException ex) {

        }

    }

    public void userUpdate(int id, String userName, String Age, String Location, String Password) {

        String sorgu = "Update users set `User-ID` = ? , `Location` = ? , `Age` = ? , `user_name` = ? ,`password`  = ? where `User-ID` = ?";
        try {
            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, Location);
            preparedStatement.setString(3, Age);
            preparedStatement.setString(4, userName);
            preparedStatement.setString(5, Password);

            preparedStatement.setInt(6, id);

            preparedStatement.executeUpdate();

        } catch (SQLException ex) {

        }
    }

    void kullaniciSil(String userID) {

        String sorgu = "DELETE FROM `users` WHERE `User-ID` = ? ";

        try {
            preparedStatement = connection.prepareStatement(sorgu);
            preparedStatement.setString(1, userID);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {

        }

    }

    void kitapSil(String ISBN) {

        String sorgu = "DELETE FROM `books` WHERE `ISBN` = ? ";

        try {
            preparedStatement = connection.prepareStatement(sorgu);
            preparedStatement.setString(1, ISBN);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {

        }

    }

    void bookUpdate(String ISBN, String bookTitle, String bookAuthor, int yearOP, String Publisher) {

        String sorgu = "Update books set `ISBN`= ?,`Book-Title`= ? ,`Book-Author`= ?,`Year-Of-Publication`= ?,`Publisher`= ? where ISBN = ?";
        try {
            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setString(1, ISBN);
            preparedStatement.setString(2, bookTitle);
            preparedStatement.setString(3, bookAuthor);
            preparedStatement.setInt(4, yearOP);
            preparedStatement.setString(5, Publisher);
            preparedStatement.setString(6, ISBN);

            preparedStatement.executeUpdate();

        } catch (SQLException ex) {

        }
    }

    void adminkitapkaydi(String ISBN, String Book_Title, String Author, int Publication, String Publisher, String table_name) {

        try {
            statement = connection.createStatement();
            String sorgu = "INSERT INTO `" + table_name + "` (`ISBN`, `Book-Title`, `Book-Author`, `Year-Of-Publication`, "
                    + "`Publisher`,`Image-URL-S`, `Image-URL-M`, `Image-URL-L`) "
                    + "VALUES (\"" +ISBN  + "\", \"" +Book_Title + "\", \""+Author+ "\", " + Publication+ ", "
                    + "\""+Publisher+"\", \" \", \" \", \" \")";
            
            System.out.println("Kitap insert : " + sorgu);
// String sorgu = "Insert Into books(`ISBN`, `Book-Title`, `Book-Author`, `Year-Of-Publication`, `Publisher`) VALUES("+"'"+ISBN+"',"+"'"+Book_Title+"',"+"'"+Author+"',"+""+Publication+","+"'"+Publisher+"'"+")";
            statement.executeUpdate(sorgu);
            statement.close();

        } catch (SQLException ex) {

        }

    }
    public ArrayList<Kitaplar> getRecentBooks() {
        
        String sorgu = "SELECT * FROM `recent_books` ORDER BY `addTime` DESC LIMIT 5";
        int yearOfP;
        String ISBN, bookName, author, publisher, imageUrlS;
        Kitaplar tempBook;
        ArrayList<Kitaplar> recentBooks = new ArrayList<>();
        try {
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sorgu);

            while (rs.next()) {
                ISBN = rs.getString("ISBN");
                bookName = rs.getString("Book-Title");
                author = rs.getString("Book-Author");
                yearOfP = rs.getInt("Year-Of-Publication");
                publisher = rs.getString("Publisher");
                imageUrlS = rs.getString("Image-URL-L");

                tempBook = new Kitaplar(ISBN, bookName, author, yearOfP, publisher, imageUrlS);
                recentBooks.add(tempBook);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return recentBooks;
    }
}
