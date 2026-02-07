package Exercicios;

import java.util.Scanner;

public class NumeroAntecessoreSucessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type a number: ");
        int num = scanner.nextInt();
        int antecessor = num-1;
        int sucessor = num+1;
        System.out.println("Antecessor: "+antecessor);
        System.out.println("Sucessor: "+sucessor);
    }
}
