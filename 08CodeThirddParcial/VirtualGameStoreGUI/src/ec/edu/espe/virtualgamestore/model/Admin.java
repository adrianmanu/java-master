/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.virtualgamestore.model;

/**
 *
 * @author Java Master
 */
public class Admin {
    private String adminName;
    private String adminPassword;

    public Admin(String name, String password) {
        this.adminName = name;
        this.adminPassword = password;

    }

    /**
     * @return the name
     */
    public String getName() {
        return adminName;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.adminName = name;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return adminPassword;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.adminPassword = password;
    }
}
