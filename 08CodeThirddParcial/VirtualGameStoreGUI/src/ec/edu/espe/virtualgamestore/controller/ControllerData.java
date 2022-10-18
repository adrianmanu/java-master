/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.virtualgamestore.controller;

import ec.edu.espe.virtualgamestore.model.Accessory;
import ec.edu.espe.virtualgamestore.model.Game;

/**
 *
 * @author JavaMasters
 */
public interface ControllerData {

    public void saveGames(Game game);
    public void saveAccessories(Accessory accessory);
    
}
