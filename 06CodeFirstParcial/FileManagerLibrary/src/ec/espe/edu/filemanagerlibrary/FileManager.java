/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.filemanagerlibrary;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Josue Moreno
 */
public class FileManager {

    public static void createFile(String name) throws IOException {

        File file = new File(name);
        file.createNewFile();

    }

    public static void writeFile(String fileName, Object collection, String name)
            throws IOException {
        FileWriter fileWriter;
        PrintWriter line;
        File file = new File(fileName);

        if (!file.exists()) {
            try {

                file.createNewFile();

                fileWriter = new FileWriter(file, true);
                line = new PrintWriter(fileWriter);

                line.println(collection);

                line.close();
                fileWriter.close();

            } catch (IOException ex) {

            }
        } else {
            try {

                fileWriter = new FileWriter(file, true);
                line = new PrintWriter(fileWriter);

                line.println(collection);

                line.close();
                fileWriter.close();
            } catch (IOException ex) {

            }

        }

    }

    public static void readFile(String fileName) throws IOException {
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fr);
            String read;
            while ((read = bufferedReader.readLine()) != null) {
                System.out.println(read);

            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error in read the file");
        }
    }

    public static void deleteFile(String fileName) {
        try {
            File file = new File(fileName);
            Scanner getFile = new Scanner(file);
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            while (getFile.hasNextLine()) {
                String line = null;
                bw.write(line);
            }
            getFile.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
