package Udemy;

import java.util.Arrays;
import java.util.Scanner;

public class VarArg {

    public static void main(String... args) {
        System.out.println("Hello world!");

        String[] my1stString = {"Abhishek", "Kumar"};
        String[] my2ndString = "Hello World Again".split(" ");

        System.out.println(Arrays.toString(my1stString));
        System.out.println(Arrays.toString(my2ndString));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Name: ");
        String name = scanner.nextLine();
        System.out.println("Please confirm your name: "+ name);
        scanner.close();

    }


}
