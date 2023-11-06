package mk.finki.ukim.lab.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Book {
    String isbn;
    String title;
    String genre;
    int year;
    List<Author> authors;

    public Book(String isbn, String title, String genre, int year) {
        this.isbn = isbn;
        this.title = title;
        this.genre = genre;
        this.year = year;
    }

    public Book(String isbn, String title, String genre, int year, List<Author> authors) {
        this.isbn = isbn;
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.authors = authors;
    }
    public Book(){
        authors = new ArrayList<>();
    }
}
