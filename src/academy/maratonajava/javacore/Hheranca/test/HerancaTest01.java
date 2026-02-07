package academy.maratonajava.javacore.Hheranca.test;

import academy.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("012345-304");
        Pessoa pessoa = new Pessoa("Lucios Zogratis");
        pessoa.setCpf("123123-33");
        pessoa.setEndereco(endereco);
        pessoa.imprime();
        System.out.println("============");
        Funcionario funcionario = new Funcionario("Oda Nubunaga");
        funcionario.setCpf("213-3222");
        funcionario.setEndereco(endereco);
        funcionario.setSalary(20000);

        funcionario.imprime();
    }
}
