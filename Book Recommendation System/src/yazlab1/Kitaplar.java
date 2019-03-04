
package yazlab1;

import java.util.ArrayList;
import java.util.Objects;


public class Kitaplar {
    
    private String kitapadi;
    private String yazaradi;
    private int yayinyili;
    private String yayinevi;
    private String ISBN;
    private String imageUrlS;
    private int frequency;
    
    
    private ArrayList<Integer> ratings;    
    
//    public Kitaplar(String ISBN) {
//        this.ISBN = ISBN;
//        ratings = new ArrayList<>();
//    }
//    
//    public Kitaplar(String ISBN, String kitapadi, String yazaradi, int yayinyili, String yayinevi) {
//        this.kitapadi = kitapadi;
//        this.yazaradi = yazaradi;
//        this.yayinyili = yayinyili;
//        this.yayinevi = yayinevi;
//        this.ISBN = ISBN;
//        ratings = new ArrayList<>();
//    }
    
    public Kitaplar(String ISBN, String kitapadi, String yazaradi, int yayinyili, String yayinevi, String imageUrlS) {
        this.kitapadi = kitapadi;
        this.yazaradi = yazaradi;
        this.yayinyili = yayinyili;
        this.yayinevi = yayinevi;
        this.ISBN = ISBN;
        this.imageUrlS = imageUrlS;
        
        ratings = new ArrayList<>();
    }
    
    public Kitaplar(String ISBN, String kitapadi, String yazaradi, int yayinyili, String yayinevi) {
        this.kitapadi = kitapadi;
        this.yazaradi = yazaradi;
        this.yayinyili = yayinyili;
        this.yayinevi = yayinevi;
        this.ISBN = ISBN;
        
        
        ratings = new ArrayList<>();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.ISBN);
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
        final Kitaplar other = (Kitaplar) obj;
        if (!Objects.equals(this.ISBN, other.ISBN)) {
            return false;
        }
        return true;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }
    public Kitaplar(String ISBN, String kitapadi, String yazaradi, int yayinyili, String yayinevi, String imageUrlS, int frequency) {
        this.kitapadi = kitapadi;
        this.yazaradi = yazaradi;
        this.yayinyili = yayinyili;
        this.yayinevi = yayinevi;
        this.ISBN = ISBN;
        this.imageUrlS = imageUrlS;
        this.frequency = frequency;
        ratings = new ArrayList<>();
    }
    
    public float getAverageRating() {
            int sum = 0;
            for (int r : ratings) {
                            sum += r;
            }

            if (ratings.size() != 0 && sum != 0){
                    int newRatingSize = 0;
                    for (int r : ratings) {
                            if (r != 0) {
                                    newRatingSize++;
                            }
                    }
                    float avgRating = sum/newRatingSize;
                    return avgRating;
            } else {
                    return (float) 0.0;
            }
    }
    
    public void addRating(int r) {
            if (r <= 11 && r > -1) {
                    ratings.add(r);
            } else {
                    throw new IllegalArgumentException("Invalid rating value");
            }
    }
    
    public void removeRating(int r) {
        ratings.remove(r);
    }
    
    
    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    
    public String getImageUrlS() {
        return imageUrlS;
    }

    public void setImageUrlS(String imageUrlS) {
        this.imageUrlS = imageUrlS;
    }   
    

    public String getKitapadi() {
        return kitapadi;
    }

    public String getYazaradi() {
        return yazaradi;
    }

    public int getYayinyili() {
        return yayinyili;
    }

    public String getYayinevi() {
        return yayinevi;
    }

    public void setKitapadi(String kitapadi) {
        this.kitapadi = kitapadi;
    }

    public void setYazaradi(String yazaradi) {
        this.yazaradi = yazaradi;
    }

    public void setYayinyili(int yayinyili) {
        this.yayinyili = yayinyili;
    }

    public void setYayinevi(String yayinevi) {
        this.yayinevi = yayinevi;
    }

    @Override
    public String toString() {
        return "ISBN : " + ISBN + " -- Book Title : " + kitapadi;
    }
    
    
    
}
