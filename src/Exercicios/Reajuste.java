package Exercicios;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Reajuste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type a value: ");
        double number = scanner.nextDouble();

        number = number + number * 0.05;
        System.out.println(number);
    }
}
