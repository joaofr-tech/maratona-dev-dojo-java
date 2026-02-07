package Exercicios;

import java.util.Scanner;

public class SalarioMinimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salarioMinimo = 1293.20f;
        System.out.println("Seu Salario: ");
        double salarioUsuario = scanner.nextDouble();
        double multiplicidadeSalarioMinimo = salarioUsuario / salarioMinimo;
        System.out.printf("Seu salario e %.2f x maior que o salario minimo", multiplicidadeSalarioMinimo);
    }
}
