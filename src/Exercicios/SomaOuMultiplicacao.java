package Exercicios;

import java.util.Scanner;

public class SomaOuMultiplicacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type a number: ");
        int num1 = scanner.nextInt();

        System.out.println("Type another number: ");
        int num2 = scanner.nextInt();
        int sum;
        if (num1 == num2){
            sum = num1 + num2;
        }else {
            sum = num1 * num2;
        }
        System.out.println(sum);
    }
}
