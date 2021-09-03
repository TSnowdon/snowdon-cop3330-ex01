/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Tyler Snowdon
 */
import java.util.Scanner;

public class App {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name? ");
        String input = scanner.nextLine();
        System.out.print("Hello, ");
        System.out.print(input);
        System.out.print(", nice to meet you!");

    }
}
