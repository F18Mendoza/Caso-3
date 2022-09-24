package jsons;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

import com.google.gson.Gson;

public class readerGarden {

    public static void main(String [] args) throws IOException{

        Reader garden = Files.newBufferedReader(Paths.get("garden.json"));

        Gson gson = new Gson();

        Map<?,?> gardenMap = gson.fromJson(garden, Map.class);

        System.out.println(gardenMap.get("jardin"));

    }
    
}