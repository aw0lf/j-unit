/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aria1
 */
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexPlay {
 public static void main( String[] args){
     System.out.println("Hello");
 }
    public boolean validateZipCode(String zipCode){
        return zipCode.matches("\\d{2}-\\d{3}");
    }
    public List<String> findEmails(String longText){
        Pattern p=Pattern.compile("[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})");
        Matcher m=p.matcher(longText);
        List<String> results=new ArrayList<>();
        while(m.find()){
            results.add(m.group());
            }
        return results;
    }
}

    


