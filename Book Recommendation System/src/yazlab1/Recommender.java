package yazlab1;

import java.util.ArrayList;
import java.util.HashMap;

public class Recommender {


    public Recommender() {
        
    }

    public static ArrayList<Kitaplar> getRecBooks(ArrayList<Users> users, Users u) {
        System.out.println("Users size : " + users.size());
        System.out.println("Current User : " + u.getKullaniciİd());
        
        HashMap<Users, Float> similarities = new HashMap<>();
        ArrayList<Users> sameOnes = new ArrayList<>();
        ArrayList<Kitaplar> recBooks = new ArrayList<>();
        for (Users user : users) {
            float common = 0;
            int total = 0;
            for (BookRating m : u.getReadBooks2()) {
                if (user.getReadBooks().contains(m.getBook()) && !u.equals(user)) {
                    int j =  0;
                    for (BookRating p : user.getReadBooks2()) {
                        if (p.getBook().equals(m.getBook())) {
                            j = p.getRating();
                        }
                    }
                    float difference = Math.abs(m.getRating() - j);
                    common += difference;
                    total++;
                } 
                else if (u.equals(user)) {
                    common = Integer.MAX_VALUE;
                    total = 1;
                } 
                else {
                    common += 5;
                    if (total == 0) {
                        total += 1;
                    }
                }
            }
            float similar = (float) common/total;
            similarities.put(user, similar);
        }
        float smallest = (float) Integer.MAX_VALUE;
        
        for(Users key : similarities.keySet()) {
            if (similarities.get(key) < smallest) {
                smallest = similarities.get(key);
            }
        }
        
        for (Users small : similarities.keySet()) {
            if (similarities.get(small) == smallest) {
                sameOnes.add(small);
            }
        }
        for (Users s : sameOnes) {
            for (BookRating br : s.getReadBooks2()) {
                if (!u.getReadBooks().contains(br.getBook()) && br.getRating() >= 3.0 && !recBooks.contains(br.getBook())) {
                    recBooks.add(br.getBook());
                }
            }
        }
        System.out.println("rec books size : " + recBooks.size());
        return recBooks;
    }
    
}
