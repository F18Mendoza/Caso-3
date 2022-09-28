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

public class readerSeasons {

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

            //System.out.println(summerObject);
            //System.out.println(springObject);
            //System.out.println(fallObject);
            //System.out.println(winterObject);

            int periodS = summerObject.get("duration").getAsInt();
            int tempertureS = summerObject.get("Temperatura").getAsInt();
            int rainS = summerObject.get("Precipitacion").getAsInt();
            int sunS = summerObject.get("Radiacion Solar").getAsInt();

            int periodP = springObject.get("duration").getAsInt();
            int tempertureP = springObject.get("Temperatura").getAsInt();
            int rainP = springObject.get("Precipitacion").getAsInt();
            int sunP = springObject.get("Radiacion Solar").getAsInt();

            int periodF = fallObject.get("duration").getAsInt();
            int tempertureF = fallObject.get("Temperatura").getAsInt();
            int rainF = fallObject.get("Precipitacion").getAsInt();
            int sunF = fallObject.get("Radiacion Solar").getAsInt();

            int periodW = winterObject.get("duration").getAsInt();
            int tempertureW = winterObject.get("Temperatura").getAsInt();
            int rainW = winterObject.get("Precipitacion").getAsInt();
            int sunW = winterObject.get("Radiacion Solar").getAsInt();

            seasons Summer = new seasons(periodS, tempertureS, rainS, sunS);
            seasons Spring = new seasons(periodP, tempertureP, rainP, sunP);
            seasons Fall = new seasons(periodF, tempertureF, rainF, sunF);
            seasons Winter = new seasons(periodW, tempertureW, rainW, sunW);

            System.out.println( Summer);
            System.out.println( Spring);
            System.out.println( Fall);
            System.out.println( Winter);




        } catch (JsonIOException e) {
            e.printStackTrace();
        } catch (JsonSyntaxException e) {
        e.printStackTrace();
        } catch (FileNotFoundException e) {
        e.printStackTrace();
        }




    }  


    
}