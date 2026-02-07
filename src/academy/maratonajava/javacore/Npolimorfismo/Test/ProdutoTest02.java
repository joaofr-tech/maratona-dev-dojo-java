package academy.maratonajava.javacore.Npolimorfismo.Test;

import academy.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());

        System.out.println("--------------------");

        Produto produto2 = new Tomate("Ryzen 9", 3000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
    }
}
