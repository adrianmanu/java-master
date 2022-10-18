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
public class Toy {

    private String id;
    private String name;
    private double size;
    private String material;
    private int price;

    public Toy(String id, String name, double size, String material, int price) {
        this.id = id;
        this.name = name;
        this.size = size;
        this.material = material;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
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

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "id: " + id + ";" + "name: " + name + ";" + "price: "
                + price + "$" + ";" + "size: "
                + size + ";" + material;
    }

}
