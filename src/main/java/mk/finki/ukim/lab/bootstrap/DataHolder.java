package mk.finki.ukim.lab.bootstrap;

import jakarta.annotation.PostConstruct;
import mk.finki.ukim.lab.model.Author;
import mk.finki.ukim.lab.model.Book;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataHolder {
    public static List<Author> authors;
    public static List<Book> books;

    @PostConstruct
    public void init(){
        authors = new ArrayList<>();
        books = new ArrayList<>();

        authors.add(new Author(1111L,"Gorgi","Nikolovski","The best author!"));
        authors.add(new Author(2222L,"Vladimir","Gogovski","Los avtor!"));
        authors.add(new Author(3333L,"Milan","Boshkovski","Eden od najdobrite vo naseto vreme!"));
        authors.add(new Author(4444L,"Borce","Smileski","Web developer so talent za pisuvanje!"));
        authors.add(new Author(5555L,"Aldin","Koleci","Daleko od avtor!"));

        books.add(new Book("213341","Titanik","Tragedy",2000));
        books.add(new Book("343242","Itar Pejo","Drama",1998));
        books.add(new Book("453466","Doktor Ofboli","Comedy",1945));
        books.add(new Book("567658","Povikot na divinata","Adventure",1780));
        books.add(new Book("445645","Beloto Cigance","Tragedija",1960));
    }
}
