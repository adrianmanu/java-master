/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.virtualgamestore.controller;

import ec.edu.espe.virtualgamestore.model.Accessory;
import ec.edu.espe.virtualgamestore.model.Game;
import ec.edu.espe.virtualgamestore.utils.DBManager;
import org.bson.Document;

/**
 *
 * @author JavaMasters
 */
public class DataConstructor implements ControllerData {

    DBManager dbManager = DBManager.getInstance();
    Document document = new Document();

    @Override
    public void saveGames(Game game) {
        document.put("id", game.getId());
        document.put("name", game.getName());
        document.put("price", game.getPrice());
        document.put("color", game.getColor());
        document.put("quantity", game.getQuantity());
        document.put("pegi", game.getPegi());

        dbManager.saveData("Games", document);
        System.out.println(document);

    }

    @Override
    public void saveAccessories(Accessory accessory) {
        document.put("id", accessory.getId());
        document.put("name", accessory.getName());
        document.put("price", accessory.getPrice());
        document.put("color", accessory.getColor());
        document.put("quantity", accessory.getQuantity());
        dbManager.saveData("Accessory", document);
        System.out.println(document);
    }

}
