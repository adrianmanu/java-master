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
public class Game {

    String name;
    String id;
    float price;
    int pegi;

    public Game(String name, String id, float price, int pegi) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.pegi = pegi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getPegi() {
        return pegi;
    }

    public void setPegi(int pegi) {
        this.pegi = pegi;
    }

    @Override
    public String toString() {
        return "id: " + id + ";" + "name: " + name + ";" + "price: "
                + price + "$" + ";" + "pegi: "
                + pegi;
    }

}
