/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.unittest.model;

/**
 *
 * @author JavaMasters
 */
public class User {

    private String name;
    private String password;
    private String Email;

    public User(String name, String password, String Email) {
        this.name = name;
        this.password = password;
        this.Email = Email;

    }

    /**
     * @return the name
     */
       
    public String getEmail() {
        return Email;
    }

    
    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

}
