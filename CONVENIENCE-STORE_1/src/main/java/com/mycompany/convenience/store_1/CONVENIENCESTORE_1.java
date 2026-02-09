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
    }
}
