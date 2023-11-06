package mk.finki.ukim.lab.service.impl;

import mk.finki.ukim.lab.model.Author;
import mk.finki.ukim.lab.model.exceptions.IdNotFoundException;
import mk.finki.ukim.lab.repository.AuthorRepository;
import mk.finki.ukim.lab.service.AuthorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {
    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public List<Author> listAuthors() {
        return authorRepository.findAll();
    }

    @Override
    public Author findById(Long id) {
        return authorRepository.findById(id).orElseThrow(IdNotFoundException::new);
    }
}
