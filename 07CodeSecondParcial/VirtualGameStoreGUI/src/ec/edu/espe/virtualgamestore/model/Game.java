/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.virtualgamestore.model;

/**
 *
 * @author JavaMasters
 */
public class Game extends Accessory {

    private int pegi;

    public Game(String id, String name, double price, String color, int pegi) {
        super(id, name, price, color);
        this.pegi = pegi;
    }

    public int getPegi() {
        return pegi;
    }

    public void setPegi(int pegi) {
        this.pegi = pegi;
    }

    @Override
    public String toString() {
        return "id: " + getId() + ";" + "name: " + getName() + ";" + "price: "
                + getPrice() + "$" + ";" + "pegi: "
                + pegi;
    }
}
