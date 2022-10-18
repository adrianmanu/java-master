/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.virtualgamestore.controller;

import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author JavaMasters
 */
public class FileManager {

    public boolean compareData(JSONObject userObject, String fileName) {
        boolean comfirm = false;
        JSONArray jsonArray = new JSONArray();
        Object object = null;
        JSONParser jsonParser = new JSONParser();
        try {
            FileReader file = new FileReader(fileName);
            object = jsonParser.parse(file);
            jsonArray = (JSONArray) object;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error has ocurred");
        }

        int size = jsonArray.size();

        for (int i = 0; i < size; i++) {
            if (userObject.equals(jsonArray.get(i))) {

                comfirm = true;
                return comfirm;

            } else if (i == size - 1) {

                return comfirm;
            }
        }
        return comfirm;
    }

    public void writeJson(JSONObject object, String fileName) {

        JSONArray jsonUsers = new JSONArray();

        JSONParser jsonParser = new JSONParser();

        try {
            FileReader fileUsers = new FileReader(fileName);
            jsonUsers = (JSONArray) jsonParser.parse(fileUsers);

        } catch (Exception ex) {

        }

        jsonUsers.add(object);

        //////////////////////////////////////////////////////////////////////////
        /*
        File file2 = null;
        FileReader fileReader = null;
        BufferedReader bufferReader = null;
        ArrayList<User> name = new ArrayList<>();
        Gson gson = new Gson();
        String line;
        String userJson = "";
        try {

            file2 = new File("Users.json");
            fileReader = new FileReader(file2);
            bufferReader = new BufferedReader(fileReader);

            while ((line = bufferReader.readLine()) != null) {
                System.out.println(line);

                userJson = userJson + line;

            }
            userJson = userJson.replace("\\", "");
            //JOptionPane.showMessageDialog(rootPane, toysJson);
            java.lang.reflect.Type usersType = new TypeToken<ArrayList<User>>() {
            }.getType();

            name = gson.fromJson(userJson, usersType);

            for (User userName : name) {
                if (user.equals(userName.getName())) {
                    JOptionPane.showMessageDialog(null, "Your user is already in"
                            + " use, please choose another user");
                    return;
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

        }*/
        ////////////////////////////////////////////////////////////////////////////////
        try {
            FileWriter file = new FileWriter(fileName);
            file.write(jsonUsers.toJSONString());
            file.close();

        } catch (Exception ex) {

        }

    }
}
