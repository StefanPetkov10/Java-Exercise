import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("The Great Gatsby", Genre.drama, 1925));
        books.add(new Book("The Da Vinci Code", Genre.thriller, 2003));
        books.add(new Book("The Catcher in the Rye", Genre.drama, 1951));

        Stream<Book> bookStream = books.stream();
        bookStream.forEach(book -> System.out.println(book.getTitle()));
        System.out.println("-------------Two streams are created-------------");
        books
                .stream()
                .forEach(book -> System.out.println(book.getTitle()));

        System.out.println("--------------------------");

        List<Book> sortedBooks = books
                .stream()
                .sorted((y1, y2) -> y1.getYear() - y2.getYear())
                .collect(Collectors.toList());
        sortedBooks.forEach(book -> System.out.println(book.getTitle() + " (" + book.getYear() + ")"));

        System.out.println("-------------Two Sorted books are created-------------");

        List<Book> sortedBooks2 = books
                .stream()
                .sorted(Comparator.comparingInt(Book::getYear))
                .collect(Collectors.toList());
        sortedBooks2.forEach(book -> System.out.println(book.getTitle() + " (" + book.getYear() + ")"));

        List<String> titles = books
                .stream()
                .map(Book::getTitle)
                .collect(Collectors.toList());

        System.out.println("-------------Titles-------------");
        titles.forEach(System.out::println);

        System.out.println("-------------Titles of books grouped by genre-------------");
        books
                .stream()
                .collect(Collectors.groupingBy(Book::getGenre))
                .forEach((genre, genreBooks) -> {
                    System.out.println(genre);
                    genreBooks.forEach(book -> System.out.println("   " + book.getTitle()));
                });
    }
}