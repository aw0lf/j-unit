/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.StringBuilder;

/**
 *
 * @author aria1
 */
public class FindEmailssTest {


    
    public FindEmailssTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testFindEmailss() {
        
        System.out.println("FindeEmailss");
        String longText="tekst zrodlowy strony z adresem xxxy@yyz.pl testy";
        FindEmailss pp = new FindEmailss();
        List<String> re= pp.findEmails(longText);
     
       if(re!=null){
       System.out.println(re);
       }
      assertEquals(true, !re.isEmpty());
    }

   
    
}
