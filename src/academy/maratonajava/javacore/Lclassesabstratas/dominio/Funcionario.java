package academy.maratonajava.javacore.Lclassesabstratas.dominio;

import academy.maratonajava.javacore.Lclassesabstratas.dominio.Pessoa;

public abstract class Funcionario extends Pessoa {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }

    public abstract void calculaBonus();

    @Override
    public void imprime() {
        System.out.println("Imprimindo...");
    }
}
