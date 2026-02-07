package Exercicios;

import java.util.Scanner;

public class AlgoritmoLeitura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("A: ");
        int A = scanner.nextInt();

        System.out.println("B: ");
        int B = scanner.nextInt();

        System.out.println("C: ");
        int C = scanner.nextInt();

        if (A + B < C){
            System.out.println("C is greater than A+B");
        }
        else {
            System.out.println("C is not greater than A+B");
        }
    }
}
