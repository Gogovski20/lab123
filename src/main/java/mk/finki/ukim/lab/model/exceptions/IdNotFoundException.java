package mk.finki.ukim.lab.model.exceptions;

public class IdNotFoundException extends RuntimeException{
    public IdNotFoundException(){
        super("Id not found!");
    }
}
