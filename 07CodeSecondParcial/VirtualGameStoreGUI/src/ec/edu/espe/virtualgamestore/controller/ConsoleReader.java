/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.virtualgamestore.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.virtualgamestore.model.Console;
import ec.edu.espe.virtualgamestore.model.Game;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class ConsoleReader {
    public ArrayList<Console> readFromFile() throws IOException {

        
        ArrayList<Console> consoles = new ArrayList<>();

        Gson gson = new Gson();
        String line;

        String consolesJson = "";

        consolesJson = new String(Files.readAllBytes(Paths.get("console.json")));

        consolesJson = consolesJson.replace("\\", "");

        java.lang.reflect.Type consolesType = new TypeToken<ArrayList<Console>>() {
        }.getType();

        consoles = gson.fromJson(consolesJson, consolesType);
        return consoles;

    }
    
}
