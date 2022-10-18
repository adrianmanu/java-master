/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.unittest.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.unittest.model.User;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class ValidateUser {
    public boolean validateEmail(String emailValidate) {

        
        Pattern pattern = Pattern
                .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        
        String email = emailValidate;

        Matcher mather = pattern.matcher(email);

        if (mather.find() == true) {

            return true;
        }

        return false;

    }
    public boolean validateUser(String user, String fileName) {

        File file = null;
        FileReader fileReader = null;
        BufferedReader bufferReader = null;
        ArrayList<User> name = new ArrayList<>();
        Gson gson = new Gson();
        String line;
        String userJson = "";
        try {

            file = new File(fileName);
            fileReader = new FileReader(file);
            bufferReader = new BufferedReader(fileReader);

            while ((line = bufferReader.readLine()) != null) {
                System.out.println(line);

                userJson = userJson + line;

            }
            userJson = userJson.replace("\\", "");
            
            java.lang.reflect.Type usersType = new TypeToken<ArrayList<User>>() {
            }.getType();

            name = gson.fromJson(userJson, usersType);

            for (User userName : name) {
                if (user.equals(userName.getName())) {

                    return true;
                }

            }

        } catch (Exception e) {

        } finally {
            try {
                if (null != fileReader) {
                    fileReader.close();
                }
            } catch (IOException e2) {
            }

        }

        return false;
    }
    
}
