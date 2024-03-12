import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
public class BookInformation {
    String name;
    //all proporties will be added in here
    //constructor getter and setter will be added
    @Override
    public String toString() {
        return "BookInformation{" +
                "Name: ='" + name + '\'' +
                //", Writer:'" + writer + '\'' + // this is just an example it will be like that
                +
                        '}';
    }

}