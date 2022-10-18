/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.virtualgamestore.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.virtualgamestore.model.Game;
import ec.edu.espe.virtualgamestore.model.Toy;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class ToyReader {
    public ArrayList<Toy> readFromFile() throws IOException {

        
        ArrayList<Toy> toys = new ArrayList<>();

        Gson gson = new Gson();
        String line;

        String toysJson = "";

        toysJson = new String(Files.readAllBytes(Paths.get("toy.json")));

        toysJson = toysJson.replace("\\", "");

        java.lang.reflect.Type toysType = new TypeToken<ArrayList<Toy>>() {
        }.getType();

        toys = gson.fromJson(toysJson, toysType);
        return toys;

    }
    
}
