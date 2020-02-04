package main.helloworld;

import java.util.Scanner;

/**
 *
 * @author qa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        System.out.println("Hello World!");
        System.out.println("Tanja Veljkovic");
        
        int age= 5;
        if(age > 18) {
            System.out.println("Osoba je punoletna.");
           
        } else {
        
        System.out.println("Osoba je maloletna.");
    }
        System.out.println("Unesite broj godina: ");
        Scanner input = new Scanner(System.in);
        int userAge = input.nextInt();
        System.out.println("Korisnik je uneo: " + userAge);
    } 
    
    
    int Personage = 7;
        if(Personage < 5) {
            System.out.println("Beba");
         }
            if(Personage > 6<11)
            {
            System.out.println("Kid");
          
          }
            
      
           if(Personage > 12<17) {
            System.out.println("Teen");
          
          }  
           
           
           if(Personage > 18) {
            System.out.println("Teen");
           
           
        
           
         else {
        
        System.out.println("Osoba je Invalid");
    }
        System.out.println("Unesite broj godina: ");
        Scanner input = new Scanner(System.in);
        int userAge = input.nextInt();
        System.out.println("Korisnik je uneo: " + userAge);
    } 
}

