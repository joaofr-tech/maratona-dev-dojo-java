package academy.maratonajava.javacore.Bintroducaometodos.test;

import academy.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("Finalizando CaculadoraTest01");
        calculadora.substriDoisNumeros();
        calculadora.multiplicaDoisNumeros(7, 7);
    }
}
