/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.unittest.controller;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USER
 */
public class ValidateUserIT {
    
    public ValidateUserIT() {
    }

    @Test
    public void testSomeMethod() {
        String user = "Josue1999";
        String fileName ="Users.json";
        boolean expectedResult = true;
        ValidateUser validate = new ValidateUser();
        boolean result = validate.validateUser(user, fileName);
        assertEquals(expectedResult,result);
       
    }
    @Test
    public void testSomeMethod1() {
        String user = "Fernando";
        String fileName ="Users.json";
        boolean expectedResult = true;
        ValidateUser validate = new ValidateUser();
        boolean result = validate.validateUser(user, fileName);
        assertEquals(expectedResult,result);
       
    }
    @Test
    public void testSomeMethod2() {
        String user = "josue";
        String fileName ="Users.json";
        boolean expectedResult = true;
        ValidateUser validate = new ValidateUser();
        boolean result = validate.validateUser(user, fileName);
        assertEquals(expectedResult,result);
       
    }
    @Test
    public void testSomeMethod3() {
        String user = "Fernando199";
        String fileName ="Users.json";
        boolean expectedResult = false;
        ValidateUser validate = new ValidateUser();
        boolean result = validate.validateUser(user, fileName);
        assertEquals(expectedResult,result);
       
    }
    @Test
    public void testSomeMethod4() {
        String user = "gabo.";
        String fileName ="Users.json";
        boolean expectedResult = false;
        ValidateUser validate = new ValidateUser();
        boolean result = validate.validateUser(user, fileName);
        assertEquals(expectedResult,result);
       
    }
    
}
