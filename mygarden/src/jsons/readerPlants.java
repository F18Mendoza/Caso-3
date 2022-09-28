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

public class readerPlants {

    public static void main(String[] args) {
        
        File garden = new File("garden.json");

        try {
            JsonElement fileGarden = JsonParser.parseReader(new FileReader(garden));

            JsonObject fileObjGarden = fileGarden.getAsJsonObject();

            JsonArray arrayPlants = fileObjGarden.get("jardin").getAsJsonArray();

            //System.out.println(arrayPlants);

            List<plants> planta = new ArrayList<>();

            for (JsonElement plantElement : arrayPlants){
                // Se obtiene el primer objeto

                JsonObject allPlantsObject = plantElement.getAsJsonObject();

                String name = allPlantsObject.get("nombre").getAsString();
                int life = allPlantsObject.get("vida").getAsInt();
                JsonObject maximos = allPlantsObject.get("maximos").getAsJsonObject();

                int agua = maximos.get("agua").getAsInt();
                int sol = maximos.get("sol").getAsInt();
                int abono = maximos.get("abono").getAsInt();
                int vidaDias = maximos.get("vidaDias").getAsInt();

                plants plant = new plants(name, life, agua, sol, abono, vidaDias);

                planta.add(plant);
                
            }

            System.out.println(planta);


        } catch (JsonIOException e) {
            e.printStackTrace();
        } catch (JsonSyntaxException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
}