/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aria1
 */
public class ValidateZipCodee {
   // public static void main( String[] args){
     //System.out.println("Hello");}
    
    public boolean validateZipCode(String zipCode){
        return zipCode.matches("\\d{2}-\\d{3}");
    }
}
