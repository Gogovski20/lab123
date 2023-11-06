package mk.finki.ukim.lab.repository;

import mk.finki.ukim.lab.bootstrap.DataHolder;
import mk.finki.ukim.lab.model.Author;
import mk.finki.ukim.lab.model.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookRepository {
    public List<Book> findAll(){
        return DataHolder.books;
    }
    public Book findByIsbn(String isbn){
        for (Book b:DataHolder.books) {
            if (b.getIsbn().equals(isbn)){
                return b;
            }
        }
        return null;
    }
    public Author addAuthorToBook(Author author, Book book){
        book.getAuthors().add(author);
        return author;
    }
}
