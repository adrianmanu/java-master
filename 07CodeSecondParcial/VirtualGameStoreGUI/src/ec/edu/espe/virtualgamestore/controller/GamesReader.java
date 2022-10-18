/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.virtualgamestore.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.virtualgamestore.model.Game;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author USER
 */
public class GamesReader {

    public ArrayList<Game> readFromFile() throws IOException {

        
        ArrayList<Game> games = new ArrayList<>();

        Gson gson = new Gson();
        String line;

        String gamesJson = "";

        gamesJson = new String(Files.readAllBytes(Paths.get("games.json")));

        gamesJson = gamesJson.replace("\\", "");

        java.lang.reflect.Type gamesType = new TypeToken<ArrayList<Game>>() {
        }.getType();

        games = gson.fromJson(gamesJson, gamesType);
        return games;

    }

}
