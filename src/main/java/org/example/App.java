/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Meola
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        int people;
        int number_of_pizzas;
        int slices_of_pizzas;

        System.out.println("How many people?");
        people = scan.nextInt();

        System.out.println("How many pizzas do you have?");
        number_of_pizzas = scan.nextInt();

        System.out.println("How many slices per pizza?");
        slices_of_pizzas = scan.nextInt();

        int total_slices = number_of_pizzas * slices_of_pizzas;

        System.out.println( people + " people with " + number_of_pizzas + " pizzas (" + total_slices + " slices)");

        if( total_slices / people ==1)
        {
            System.out.println("Each person gets " + total_slices / people + " piece of pizza.");
            System.out.println("There are " + ( total_slices % people ) + " leftover pieces.");
        }
        else
        {
            System.out.println("Each person gets "+ total_slices / people+" pieces of pizza.");
            System.out.println("There are "+( total_slices % people )+" leftover pieces.");
        }
    }
}
