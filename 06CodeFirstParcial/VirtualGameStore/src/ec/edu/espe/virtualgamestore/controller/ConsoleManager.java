/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.virtualgamestore.controller;

import ec.edu.espe.virtualgamestore.model.Console;
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
public class ConsoleManager {

    public void addConsole() throws IOException {

        Collection things;
        things = new ArrayList();
        things.add(new Console("01", "PS5", 700, "DIGITAL"));
        things.add(new Console("02", "PS3", 300.98, "SLIM"));
        things.add(new Console("03", "PS4", 450, "PRO"));
        things.add(new Console("04", "PS2", 100.99, "BASIC"));
        things.add(new Console("05", "PSP", 200, "VITA"));
        things.add(new Console("06", "XBOX 360", 120, "ELITE"));
        things.add(new Console("07", "XBOX SERIES X", 120, "BASIC"));
        things.add(new Console("08", "XBOX 360", 120, "SLIM"));
        things.add(new Console("09", "Nintendo Switch", 120, "LITE"));
        things.add(new Console("10", "XBOX ONE", 120, "AUDI"));
        Object[] thingsArray = new Object[things.size()];
        thingsArray = things.toArray();
        FileManager.writeFile("console.csv", thingsArray[things.size() - 1], "");

    }
}
