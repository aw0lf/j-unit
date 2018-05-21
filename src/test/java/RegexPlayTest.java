/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aria1
 */
public class RegexPlayTest {
   
   //Poprawna skladania
    @Test
    public void testValidateZipCode() {
        System.out.println("validateZipCode");
        String zipCode = "65-113";
        RegexPlay instance = new RegexPlay();
        
        boolean result = instance.validateZipCode(zipCode);
        assertEquals(true, result);   
    }
    //Bledna skladania
    @Test
    public void testValidateZipCode2() {
        System.out.println("validateZipCode");
        String zipCode = "4332";
        RegexPlay instance = new RegexPlay();
        
        boolean result = instance.validateZipCode(zipCode);
        assertEquals(false, result);
        
    }
    //Bledna skladnia
    @Test
    public void testValidateZipCode3() {
        System.out.println("validateZipCode");
        String zipCode = "4-332";
        RegexPlay instance = new RegexPlay();
        
        boolean result = instance.validateZipCode(zipCode);
        assertEquals(false, result);
        
    }
    //Teskt zrodlowy z poprawnym adresem @
    @Test
    public void testFindEmails() {
        
        System.out.println("FindeEmails");
        String longText="tekst zrodlowy strony z adresem xxxy@yyz.pl testy";
        RegexPlay instance = new RegexPlay();
        List<String> re= instance.findEmails(longText);
     
       if(!re.isEmpty()){
       System.out.println(re);
       }
      assertEquals(true, !re.isEmpty());
    }
    //Teskt zrodlowy z blednym adresem @
    @Test
    public void testFindEmails2() {
        
        System.out.println("FindeEmails");
        String longText="tekst zrodlowy strony z adresem xxxyyyz.pl testy";
        RegexPlay instance = new RegexPlay();
        List<String> re= instance.findEmails(longText);
     
       if(!re.isEmpty()){
       System.out.println(re);
       }
      assertEquals(false, !re.isEmpty());
    }
    //Teskt zrodlowy z poprawnym adresem @
    @Test
    public void testFindEmails3() {
        
        System.out.println("FindeEmails");
        String longText="tekst zrodlowy strony z adresem xxxyz@com testy, troche inny zaq12wsx@zzz.vb.com";
        RegexPlay instance = new RegexPlay();
        List<String> re= instance.findEmails(longText);
     
       if(!re.isEmpty()){
       System.out.println(re);
       }
      assertEquals(true, !re.isEmpty());
    }
}
