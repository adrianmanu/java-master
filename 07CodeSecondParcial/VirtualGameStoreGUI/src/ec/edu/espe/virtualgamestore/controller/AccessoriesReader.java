/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.virtualgamestore.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.virtualgamestore.model.Accessory;
import ec.edu.espe.virtualgamestore.model.Game;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class AccessoriesReader {
    public ArrayList<Accessory> readFromFile() throws IOException {

        
        ArrayList<Accessory> accessorys = new ArrayList<>();

        Gson gson = new Gson();
        String line;

        String accessoryJson = "";

        accessoryJson = new String(Files.readAllBytes(Paths.get("accessory.json")));

        accessoryJson = accessoryJson.replace("\\", "");

        java.lang.reflect.Type accessoryType = new TypeToken<ArrayList<Accessory>>() {
        }.getType();

        accessorys = gson.fromJson(accessoryJson, accessoryType);
        return accessorys;

    }
    
}
