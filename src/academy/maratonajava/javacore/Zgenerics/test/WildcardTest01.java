package academy.maratonajava.javacore.Zgenerics.test;

abstract class Animal{
    public abstract void consulta();
}
class Cachorrro extends Animal {

    @Override
    public void consulta(){
        System.out.println("Consultando dogs");
    }
}

class Gato extends Animal {

    @Override
    public void consulta() {
        System.out.println("Consultando catius");
    }
}

public class WildcardTest01 {
    public static void main(String[] args) {
        Cachorrro[] cachorros = {new Cachorrro(), new Cachorrro()};
        Gato[] gatos = {new Gato(), new Gato()};
        printConsulta(cachorros);
        printConsulta(gatos);

    }
    private static void printConsulta(Animal[] animals) {
        for (Animal animal : animals) {
            animal.consulta();
        }

    }
}
