public class Book {

    private int year;
    private String title;
    private Genre genre;

    public Book(String title, Genre genre, int year) {
        this.title = title;
        this.year = year;
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public String getTitle() {
        return title;
    }

    public Genre getGenre() {
        return genre;
    }
}
