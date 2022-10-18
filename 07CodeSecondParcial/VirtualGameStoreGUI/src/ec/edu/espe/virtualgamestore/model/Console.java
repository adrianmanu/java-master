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
public class Console extends Accessory {

    private String edition;

    public Console(String id, String name, double price, String color, String edition) {
        super(id, name, price, color);
        this.edition = edition;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    @Override
    public String toString() {
        return "id: " + getId() + ";" + "name: " + getName() + ";" + "price: "
                + getPrice() + "$" + ";" + "edition: "
                + edition;
    }
}
