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
public class Customer {

    String accessorys, games, toys, consoles, price;

    public Customer(String accessorys, String games, String toys, String consoles, String price) {
        this.accessorys = accessorys;
        this.games = games;
        this.toys = toys;
        this.consoles = consoles;
        this.price = price;
    }

    public String getAccessorys() {
        return accessorys;
    }

    public void setAccessorys(String accessorys) {
        this.accessorys = accessorys;
    }

    public String getGames() {
        return games;
    }

    public void setGames(String games) {
        this.games = games;
    }

    public String getToys() {
        return toys;
    }

    public void setToys(String toys) {
        this.toys = toys;
    }

    public String getConsoles() {
        return consoles;
    }

    public void setConsoles(String consoles) {
        this.consoles = consoles;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

}
