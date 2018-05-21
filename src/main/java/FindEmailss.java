
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aria1
 */
public class FindEmailss {
    
    public static void main( String[] args){
     System.out.println("Hello");
    // String tekst="tekst zrodlowy strony z adresem xxxyy@yz.pl testy";
   //FindEmailss test= new FindEmailss();
     //   List<String> wynik= test.findEmails(tekst);
       // System.out.println(wynik);
    
    
    }
    
    public List<String> findEmails(String longText){
       // longText = "tekst zrodlowy strony z adresem xxx@yyyz testy";
        Pattern p=Pattern.compile("[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})");
        Matcher m=p.matcher(longText);
        List<String> results=new ArrayList<>();
        while(m.find()){
            results.add(m.group());
            
            }
        return results;
}
}
