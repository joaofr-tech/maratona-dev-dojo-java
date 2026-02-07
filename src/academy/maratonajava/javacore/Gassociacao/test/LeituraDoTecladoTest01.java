package academy.maratonajava.javacore.Gassociacao.test;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String name = input.nextLine();
        System.out.print("Digite sua idade: ");
        int age = input.nextInt();
        System.out.println("-----------");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
