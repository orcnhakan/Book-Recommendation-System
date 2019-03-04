package yazlab1;

public class BookRating {
    
    private Kitaplar book;
    private int rating;

    public BookRating(Kitaplar b, int r) {
            book = b;
            rating = r;
    }

    public String toString() {
            if (rating > 0.0) {
                    return rating + "";
            } else {
                    return book.getAverageRating() + "(average rating)";
            }
    }

    public Kitaplar getBook() {
            return book;
    }

    public int getRating() {
            return rating;
    }

    public void setRating(int r) {
            rating = r;
    }
}
