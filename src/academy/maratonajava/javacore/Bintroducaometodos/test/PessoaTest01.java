package academy.maratonajava.javacore.Bintroducaometodos.test;

import academy.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setName("Jiraya");
        pessoa.setAge(34);
        pessoa.imprime();
        System.out.println(pessoa.getName());
    }
}
