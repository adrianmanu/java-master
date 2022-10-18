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
import ec.edu.espe.virtualgamestore.model.Accessory;
import ec.edu.espe.virtualgamestore.model.Game;
import ec.edu.espe.virtualgamestore.utils.DBManager;
import java.util.ArrayList;
import org.bson.Document;

/**
 *
 * @author JavaMasters
 */
public class ControllerTable {

    public static ArrayList<Game> getGame() {
        ArrayList<Game> games = new ArrayList<>();
        MongoDatabase database = DBManager.getInstance().connection;
        MongoCollection gamesCollection = database.getCollection("Games");
        MongoCursor<Document> cursor = gamesCollection.find().iterator();
        try {
            while (cursor.hasNext()) {
                JsonObject jsonObject = new JsonParser().parse(cursor.next().toJson()).getAsJsonObject();
                Game game = new Game();
                game.setId(jsonObject.get("id").getAsString());
                game.setName(jsonObject.get("name").getAsString());
                game.setPrice(jsonObject.get("price").getAsString());
                game.setColor(jsonObject.get("color").getAsString());
                game.setQuantity(jsonObject.get("quantity").getAsString());
                game.setPegi(jsonObject.get("pegi").getAsString());
                //game.setId(jsonObject.get("_id").getAsJsonObject().get("$oid").getAsString());
                games.add(game);
            }
        } finally {
            cursor.close();
        }
        return games;
    }

    public static ArrayList<Accessory> getAccessory() {
        ArrayList<Accessory> accessory = new ArrayList<>();
        MongoDatabase database = DBManager.getInstance().connection;
        MongoCollection gamesCollection = database.getCollection("Accessory");
        MongoCursor<Document> cursor = gamesCollection.find().iterator();
        try {
            while (cursor.hasNext()) {
                JsonObject jsonObject = new JsonParser().parse(cursor.next().toJson()).getAsJsonObject();
                Accessory accessories = new Accessory();
                accessories.setId(jsonObject.get("id").getAsString());
                accessories.setName(jsonObject.get("name").getAsString());
                accessories.setPrice(jsonObject.get("price").getAsString());
                accessories.setColor(jsonObject.get("color").getAsString());
                accessories.setQuantity(jsonObject.get("quantity").getAsString());
                //game.setId(jsonObject.get("_id").getAsJsonObject().get("$oid").getAsString());
                accessory.add(accessories);
            }
        } finally {
            cursor.close();
        }
        return accessory;
    }

}
