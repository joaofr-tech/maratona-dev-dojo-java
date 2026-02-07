package academy.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
    private double salary;

    public Funcionario(String name){
        super(name);
    }

    public void imprime() {
        super.imprime();
        System.out.println(this.salary);
    }

    public void relatorioPagamento() {
        System.out.println("Eu " + this.name + " recebi o salario de " + this.salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
