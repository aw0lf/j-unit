/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aria1
 */
public class ValidateZipCodeeTest {
    
    //Poprawne dane
    @Test
    public void testValidateZipCode() {
        System.out.println("validateZipCode");
        String zipCode = "65-113";
        ValidateZipCodee instance = new ValidateZipCodee();
        
        boolean result = instance.validateZipCode(zipCode);
        assertEquals(true, result);
        
    }
    
    @Test
    public void testValidateZipCode2() {
        System.out.println("validateZipCode");
        String zipCode = "4-332";
        ValidateZipCodee instance = new ValidateZipCodee();
        
        boolean result = instance.validateZipCode(zipCode);
        assertEquals(true, result);
        
    }
    
}
