package mk.finki.ukim.lab.service;

import mk.finki.ukim.lab.model.Author;

import java.util.List;

public interface AuthorService {
    List<Author> listAuthors();
    Author findById(Long id);
}
