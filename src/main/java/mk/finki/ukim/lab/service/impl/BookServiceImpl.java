package mk.finki.ukim.lab.service.impl;

import mk.finki.ukim.lab.model.Author;
import mk.finki.ukim.lab.model.Book;
import mk.finki.ukim.lab.repository.AuthorRepository;
import mk.finki.ukim.lab.repository.BookRepository;
import mk.finki.ukim.lab.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BookServiceImpl(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }


    @Override
    public List<Book> listBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Author addAuthorToBook(Long authorId, String isbn) {
        Author author = authorRepository.findById(authorId).orElse(null);
        Book book = bookRepository.findByIsbn(isbn);

        if(author != null && book != null){
            book.getAuthors().add(author);
        }
        return author;
    }

    @Override
    public Book findBookByIsbn(String isbn) {
        return bookRepository.findByIsbn(isbn);
    }
}
