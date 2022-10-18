/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.virtualgamestore.controller;

import ec.edu.espe.virtualgamestore.model.Game;
import ec.espe.edu.filemanagerlibrary.FileManager;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JavaMasters
 */
public class GameManager {

    public void addGame() throws IOException {

        Collection things;

        things = new ArrayList();
        things.add(new Game("GTA5", "31", 56, 16));
        things.add(new Game("Dota", "32", 28, 12));
        things.add(new Game("Pirates of the Caribbean", "33", 33, 12));
        things.add(new Game("Balloneta", "34", 23, 12));
        things.add(new Game("God of war", "35", 46, 18));
        things.add(new Game("Beyonx", "36", 30, 12));
        things.add(new Game("Plants vs Zombies", "37", 25, 12));
        things.add(new Game("Resident Evil 1", "38", 30, 16));
        things.add(new Game("Cup Head", "39", 38, 12));
        things.add(new Game("Injustice", "40", 20, 12));

        Object[] thingsArray = new Object[things.size()];
        thingsArray = things.toArray();
        FileManager.writeFile("games.csv", thingsArray[things.size() - 1], "");

    }
}
