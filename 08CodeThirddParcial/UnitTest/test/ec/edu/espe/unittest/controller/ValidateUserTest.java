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
public class ValidateUserTest {
    
    public ValidateUserTest() {
    }

    @Test
    public void testSomeMethod() {
        String email = "jamoreno15@espe.edu.ec";
        boolean expectedResult = true;
        ValidateUser validate = new ValidateUser();
        boolean result = validate.validateEmail(email);
        assertEquals(expectedResult,result);
    }
    
    @Test
    public void testSomeMethod1() {
        String email = "lfnoguera@espe.edu.ec ";
        boolean expectedResult = true;
        ValidateUser validate = new ValidateUser();
        boolean result = validate.validateEmail(email);
        assertEquals(expectedResult,result);
    }
     @Test
    public void testSomeMethod2() {
        String email = "jjalemanespe.edu.ec";
        boolean expectedResult = false;
        ValidateUser validate = new ValidateUser();
        boolean result = validate.validateEmail(email);
        assertEquals(expectedResult,result);
    }
     @Test
    public void testSomeMethod3() {
        String email = "jamoreno1518@espe.edu.ec";
        boolean expectedResult = true;
        ValidateUser validate = new ValidateUser();
        boolean result = validate.validateEmail(email);
        assertEquals(expectedResult,result);
    }
     @Test
    public void testSomeMethod4() {
        String email = "samyromanv@Hotmail.com";
        boolean expectedResult = false;
        ValidateUser validate = new ValidateUser();
        boolean result = validate.validateEmail(email);
        assertEquals(expectedResult,result);
    }
      @Test
    public void testSomeMethod5() {
        String email = "12345.6@gmail.com";
        boolean expectedResult = true;
        ValidateUser validate = new ValidateUser();
        boolean result = validate.validateEmail(email);
        assertEquals(expectedResult,result);
    }
    
}
