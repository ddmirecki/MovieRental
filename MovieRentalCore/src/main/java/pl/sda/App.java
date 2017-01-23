package pl.sda;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException {

        Gson gson = new Gson();

        Customer customer = new Customer("Adam", "kowalski", 1980, 123);
        List<Movie>  movies = new ArrayList<>();
        movies.add(new Movie("Terminator"));
        movies.add(new Movie("Matrix"));
        movies.add(new Movie("Forrest Gump"));

        Rental rental = new Rental(customer, new Date(), new Date(), movies);

        String json = gson.toJson(rental);

//        System.out.println(json);
//        FileWriter fileWriter = new FileWriter("rental.json");
//        gson.toJson(rental, fileWriter);
//        fileWriter.flush();
//        fileWriter.close();

        Rental rental1 = gson.fromJson(new FileReader("rental.json"), Rental.class);
        System.out.println(rental1);

//        gson.toJson(customer);
//        gson.toJson(rental);
//        String json = gson.toJson(rental);
//        Rental rental11 = gson.fromJson(json, Rental.class);
//        System.out.println(rental);
//        System.out.println();
//        System.out.println(json);
//        System.out.println(rental11);
//        System.out.println(customer);
    }
}
