/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kameryn Cambridge
 */
package org.example;
import java.util.Objects;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        String password = "abc$123";

        System.out.println("Enter a username: ");
        String username = sc.nextLine();
        System.out.println("Enter a password: ");
        String userPassword = sc.nextLine();

        if(Objects.equals(userPassword, password))
        {
            System.out.println("Welcome!");
        }
        else
        {
            System.out.println("I don't know you.");
        }
    }
}
