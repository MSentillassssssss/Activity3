package com.mycompany.act3;

import java.util.Scanner;

public class Act3 {

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        double celcius;
        
        System.out.println("Enter temperature in Celcius: ");
        celcius = scn.nextDouble();
        
        double fahrenheit = (celcius * 9/5+32);
        
        System.out.println("\n" + "Temperature in Fahrenheit: " + "\n" + fahrenheit + "°F" );
       // System.out.println("Since 1°C is equal to 33.8");
        System.out.println("\n" + "So " + celcius + "°C is equal to" + " " + fahrenheit + "°F" + ".");
        
        scn.close();
    }
}
