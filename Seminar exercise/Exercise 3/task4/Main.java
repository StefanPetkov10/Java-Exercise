package task4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("1984", "George Orwell"));
        bookList.add(new Book("To Kill a Mockingbird", "Harper Lee"));
        bookList.add(new Book("The Great Gatsby", "F. Scott Fitzgerald"));

        String fileName = "books.ser";

        serializeBookList(bookList, fileName);

        List<Book> deserializedBooks = deserializeBookList(fileName);

        System.out.println("Deserialized Books:");
        deserializedBooks.forEach(System.out::println);
    }

    private static void serializeBookList(List<Book> bookList, String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(bookList);
            System.out.println("Books have been serialized to " + fileName);
        } catch (IOException e) {
            System.err.println("Error during serialization: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    private static List<Book> deserializeBookList(String fileName) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return (List<Book>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error during deserialization: " + e.getMessage());
        }
        return new ArrayList<>();
    }
}