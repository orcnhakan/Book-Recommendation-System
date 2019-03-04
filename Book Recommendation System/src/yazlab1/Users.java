package yazlab1;

import java.util.ArrayList;

public class Users {

    private int userId;
    private String kullaniciAdi;
    private String kullaniciSifre;
    private int kullaniciİd;
    private String lokasyon;
    private String yas;

    private ArrayList<BookRating> readBooks;

//    public Users() {
//
//        readBooks = new ArrayList<>();
//    }
    public Users(int userId) {
        this.userId = userId;
        readBooks = new ArrayList<>();

    }
    public Users(int userId, String kullaniciAdi, String lokasyon, String yas, String kullaniciSifre) {

        this.userId = userId;
        this.lokasyon = lokasyon;
        this.yas = yas;
        this.kullaniciSifre = kullaniciSifre;
        readBooks = new ArrayList<>();

    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.userId;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Users other = (Users) obj;
        if (this.userId != other.userId) {
            return false;
        }
        return true;
    }



    @Override
    public String toString() {
        return "Users{" + "userId=" + userId + ", kullaniciAdi=" + kullaniciAdi + ", kullanici\u0130d=" + kullaniciİd + '}';
    }
    
    

    public String getRating(Kitaplar b) {
        for (BookRating br : readBooks) {
            if (b.equals(br.getBook())) {
                if (br.getRating() != 0) {
                    return br.getRating() + " (your rating)";
                } else {
                    return b.getAverageRating() + " (average rating)";
                }
            }
        }
        return b.getAverageRating() + " (average rating)";
    }

    public void addRating(Kitaplar b, int rating) {
        int notIn = 0;
        for (BookRating br : readBooks) {
            if (br.getBook().equals(b)) {
                if (rating != 0) {
                    b.removeRating(br.getRating());
                    b.addRating(rating);
                    br.setRating(rating);
                }
            } else {
                notIn += 1;
            }
        }
        if (notIn == readBooks.size()) {
            b.addRating(rating);
            readBooks.add(new BookRating(b, rating));
        }
    }

    public ArrayList<Kitaplar> getReadBooks() {
        ArrayList<Kitaplar> rBooks = new ArrayList<>();
        for (BookRating br : readBooks) {
            rBooks.add(br.getBook());
        }
        return rBooks;
    }

    public ArrayList<BookRating> getReadBooks2() {
        return readBooks;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getKullaniciSifre() {
        return kullaniciSifre;
    }

    public void setKullaniciSifre(String kullaniciSifre) {
        this.kullaniciSifre = kullaniciSifre;
    }

    public int getKullaniciİd() {
        return kullaniciİd;
    }

    public void setKullaniciİd(int kullaniciİd) {
        this.kullaniciİd = kullaniciİd;
    }

    public String getLokasyon() {
        return lokasyon;
    }

    public void setLokasyon(String lokasyon) {
        this.lokasyon = lokasyon;
    }

    public String getYas() {
        return yas;
    }

    public void setYas(String yas) {
        this.yas = yas;
    }
    public int getuserId() {
        return userId;
    }

    public void setuserId(int userId) {
        this.userId = userId;
    }

}
