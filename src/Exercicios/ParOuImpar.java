package Exercicios;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0){
            System.out.println("The number is even");
        }
        else {
            System.out.println("The number is odd");
        }

        if (number == 0){
            System.out.println("The number is zero");
        } else if (number >= 1) {
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is negative");
        }
    }
}
