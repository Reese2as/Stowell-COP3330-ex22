/*
 *  UCF COP3330 Fall 2021 Assignment 22 Solution
 *  Copyright 2021 Reese Stowell
 */
package org.example;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        int num1, num2, num3, large_num;

        System.out.print("Enter the first number: ");
        num1 = user_input.nextInt();
        System.out.print("Enter the second number: ");
        num2 = user_input.nextInt();
        System.out.print("Enter the third number: ");
        num3 = user_input.nextInt();

        large_num = num1;
        if (num2 > large_num)
        {
            large_num = num2;
        }
        if (num3 > large_num)
        {
            large_num = num3;
        }
        
        System.out.println(String.format("The largest number is %d.", large_num));
    }
}
