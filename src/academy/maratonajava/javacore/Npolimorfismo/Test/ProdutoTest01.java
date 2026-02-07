package academy.maratonajava.javacore.Npolimorfismo.Test;

import academy.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import academy.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomate Irlandes", 12);
        Televisao televisao = new Televisao("Samsung 50", 5000);

        CalculadoraImposto.calcularImposto(televisao);
        System.out.println("______________________");
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("++++++++++++++++++++");
        CalculadoraImposto.calcularImposto(tomate);
    }
}
