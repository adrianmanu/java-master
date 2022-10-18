/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.virtualgamestore.controller;

import ec.edu.espe.virtualgamestore.model.Accessory;
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
public class AccessoryManager {

    public void addAccessory() throws IOException {

        Collection things;
        things = new ArrayList();
        things.add(new Accessory("11", "Control", 40.99, "Black"));
        things.add(new Accessory("12", "Headphones", 30, "White"));
        things.add(new Accessory("13", "Microphone", 50, "White"));
        things.add(new Accessory("14", "PlayStation Move", 10, "Black"));
        things.add(new Accessory("15", "PlayStation Camera", 20, "Black"));
        things.add(new Accessory("16", "VR Headset", 12.99, "White"));
        things.add(new Accessory("17", "DualShock Charging Station", 12.99,
                "White"));
        things.add(new Accessory("18", "USB Wireless Adaptor", 12.99,
                "White"));
        things.add(new Accessory("19", "Microsoft Media Remote", 12.99,
                "White"));
        things.add(new Accessory("20", "Charger", 12.99, "Black"));
        Object[] thingsArray = new Object[things.size()];
        thingsArray = things.toArray();

        FileManager.writeFile("accessory.csv", thingsArray[things.size() -1], "");
    
        
    }
}
