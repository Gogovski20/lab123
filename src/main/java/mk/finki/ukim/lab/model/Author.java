package mk.finki.ukim.lab.model;


import lombok.Data;

@Data
public class Author {
    Long id;
    String name;
    String surname;
    String biography;

    public Author(Long id, String name, String surname, String biography) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.biography = biography;
    }
}
