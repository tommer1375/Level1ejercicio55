
import java.io.*;
import java.util.*;

public class n5ejercicio5 {
    public static void main(String[] args) {

        Books[] readBooks = new Books[3];

        readBooks[0] = new Books("Lord of the Rings", "JRR Tolkine", 1954);
        readBooks[1] = new Books("Dune", "Frank Herbert", 1965);
        readBooks[2] = new Books("Blade Runner", "Philip K. Dick", 1968);


        try {
            ObjectOutputStream writing_file = new ObjectOutputStream(new FileOutputStream("books.ser"));
            writing_file.writeObject(readBooks);
            writing_file.close();

            ObjectInputStream reading_file = new ObjectInputStream(new FileInputStream("books.ser"));
            Books[] recovery_books=(Books[]) reading_file.readObject();

            reading_file.close();

            for(Books e: recovery_books) {
                System.out.println(e);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("Fin del programa");
        }

    }
}
