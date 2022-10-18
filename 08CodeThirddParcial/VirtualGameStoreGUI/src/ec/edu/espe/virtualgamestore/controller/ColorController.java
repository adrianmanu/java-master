/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.virtualgamestore.controller;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.virtualgamestore.model.Color;
import ec.edu.espe.virtualgamestore.utils.DBManager;
import java.util.ArrayList;
import org.bson.Document;

/**
 *
 * @author JavaMasters
 */
public class ColorController {

    public static ArrayList<Color> fillComboBoxExpense() {
        ArrayList<Color> colors = new ArrayList<>();

        MongoDatabase database = DBManager.getInstance().connection;
        MongoCollection colorCollection = database.getCollection("Color");
        try (MongoCursor<Document> cursor = colorCollection.find().iterator()) {
            while (cursor.hasNext()) {
                JsonObject jsonObject = new JsonParser().parse(cursor.next().toJson()).getAsJsonObject();
                Color color = new Color();
                color.setDescription(jsonObject.get("description").getAsString());

                color.setId(jsonObject.get("_id").getAsJsonObject().get("$oid").getAsString());
                colors.add(color);
            }
        }
        return colors;
    }
}
