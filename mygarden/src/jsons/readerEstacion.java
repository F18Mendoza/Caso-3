package jsons;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

public class readerEstacion {

    public static void main(String[] args) {

        File estaciones = new File("estaciones.json");

        try {

            JsonElement fileEstaciones = JsonParser.parseReader(new FileReader(estaciones));

            JsonObject principalObject = fileEstaciones.getAsJsonObject();

            JsonObject estacionObject = principalObject.get("Season").getAsJsonObject();

            JsonObject summerObject = estacionObject.get("Summer").getAsJsonObject();

            JsonObject springObject = estacionObject.get("Spring").getAsJsonObject();

            JsonObject fallObject = estacionObject.get("Fall").getAsJsonObject();

            JsonObject winterObject = estacionObject.get("Winter").getAsJsonObject();

            System.out.println(summerObject);
            System.out.println(springObject);
            System.out.println(fallObject);
            System.out.println(winterObject);



        } catch (JsonIOException e) {
            e.printStackTrace();
        } catch (JsonSyntaxException e) {
        e.printStackTrace();
        } catch (FileNotFoundException e) {
        e.printStackTrace();
        }




    }  


    
}