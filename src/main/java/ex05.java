/*
 *  UCF COP3330 Fall 2021 Assignment 05 Solution
 *  Copyright 2021 Chase Cutshall
 */

import java.util.Scanner;
public class ex05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String firstnumber;
        System.out.print(" Enter a number:");

        firstnumber = input.next();

        Integer i = Integer.parseInt(firstnumber);

        String secondnumber;
        System.out.print(" Enter a second number:");

        secondnumber = input.next();

        Integer j = Integer.parseInt(secondnumber);

        int sum = j + i;
        int difference = i - j;
        int multiplication = i * j;
        int division = i / j ;

        System.out.print(i + " + " + j + " = " + sum + System.lineSeparator() );
        System.out.print(i + " - " + j + " = " + difference + System.lineSeparator());
        System.out.print(i + " * " + j + " = " + multiplication + System.lineSeparator());
        System.out.print(i + " / " + j + " = " + division + System.lineSeparator());

    }
}


