/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.convenience.store_1;

/**
 *
 * @author USER
 */
// FEBRUARY 8, 2026: STARTING POINT

// FEBRUARY 9, 2026: 
// FEATURES ADDED:
// scanner
// variable
// user input

// FEBRUARY 11, 2026:
// FEATURES ADDED:
// switch

// ERROR/S FIXED: parsing error
// SOLUTION: watched a youtube tutorial regarding curly bracket placements

import java.util.Scanner;

public class CONVENIENCESTORE_1 
{

    public static void main(String[] args) 
    {
        Scanner myObj = new Scanner(System.in);
        int choice = 0;
        
        System.out.println("===== WELCOME TO THE CONVINIENCE STORE! =====");
        System.out.println("[1] CREATE ACCOUNT");
        System.out.println("[2] MENU");
        System.out.println("[3] ATM");
        System.out.println("[4] EXIT PROGRAM");
        System.out.println("ENTER YOUR CHOICE: ");
        choice = myObj.nextInt();
        
            switch (choice)
            {
            case 1:
                System.out.println("===== CREATE ACCOUNT =====");
                break; 
            
            case 2:
                System.out.println("===== MENU =====");
                break; 
                
            case 3:
                System.out.println("===== ATM =====");
                break; 
                
            case 4:
                System.out.println("THANK YOU FOR USING THE CONVENIENCE STORE");
                break;
                
                default:
                System.out.println("Looking forward to the Weekend");
           }      
    
    }
        
}
