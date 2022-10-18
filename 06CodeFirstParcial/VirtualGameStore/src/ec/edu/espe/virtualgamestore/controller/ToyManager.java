/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.virtualgamestore.controller;

/**
 *
 * @author JavaMasters
 */
import ec.edu.espe.virtualgamestore.model.Toy;
import ec.espe.edu.filemanagerlibrary.FileManager;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ToyManager {

    public void addToy() throws IOException {

        Collection things;

        things = new ArrayList();
        things.add(new Toy("21", "boss", 10, "plastic", 20));
        things.add(new Toy("22", "Barbi", 5, "plastic", 18));
        things.add(new Toy("23", "Ken", 6.6, "plastic", 12));
        things.add(new Toy("24", "Paw", 7.8, "plastic", 16));
        things.add(new Toy("25", "bicycle", 100.2, "Irom", 99));
        things.add(new Toy("26", "Car", 9.9, "plastic", 34));
        things.add(new Toy("27", "airplane", 45, "acrylic", 35));
        things.add(new Toy("28", "doll", 7.6, "plastic", 10));
        things.add(new Toy("29", "Ben ten", 14, "plastic", 20));
        things.add(new Toy("30", "kite", 26, "cloth", 7));

        Object[] thingsArray = new Object[things.size()];
        thingsArray = things.toArray();
        FileManager.writeFile("toys.csv", thingsArray[things.size() - 1], "");

    }

}
