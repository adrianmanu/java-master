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
public class Accessory {

    private String id;                
    private String name;
    private double price;
    private String color;

    public Accessory(String id, String name, double price, String color) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.color = color;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "id: " + id + ";" + "name: " + name + ";" + "price: "
                + price + "$" + ";" + "color: "
                + color;
    }

}
