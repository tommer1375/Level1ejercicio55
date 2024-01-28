
import java.util.*;
import java.io.*;

public class Books implements Serializable {

    private String title;
    private String author;
    private int year;

    public Books (String title, String author, int year){
        this.title=title;
        this.author=author;
        this.year=year;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getYear(){
        return year;
    }
    public String toString(){
        return "El libro "+title+" del autor "+author+" publicado en el año "+year;

    }
}
