/*
 *  UCF COP3330 Fall 2021 Assignment 1.15 Solution
 *  Copyright 2021 Amos Luo
 */

package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {

        Scanner x = new Scanner(System.in);
        System.out.print("What is the password? "); //Asking for user input
        String pass = x.nextLine(); //Storing user input

        if (pass.equals("abc$123")) { //If user input does not match pass, print "I don't know"
            System.out.println("Welcome! ");
        } else {
            System.out.println("I don't know you.");
        }
    }
}