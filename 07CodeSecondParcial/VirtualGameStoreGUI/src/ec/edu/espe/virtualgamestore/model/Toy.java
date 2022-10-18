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
public class Toy extends Accessory {

    private double size;
    private String material;

    public Toy(String id, String name, double price, String color,
            String material, double size) {
        super(id, name, price, color);
        this.material = material;
        this.size = size;
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
        return "id: " + getId() + ";" + "name: " + getName() + ";" + "price: "
                + getPrice() + "$" + ";" + "size: "
                + size + ";" + material;
    }

}
