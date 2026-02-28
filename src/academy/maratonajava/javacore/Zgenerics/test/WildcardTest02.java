package academy.maratonajava.javacore.Zgenerics.test;

import java.util.ArrayList;
import java.util.List;

public class WildcardTest02 {
    public static void main(String[] args) {
        List<Cachorrro> cahorros = List.of(new Cachorrro(), new Cachorrro());
        List<Gato> gatos = List.of(new Gato(), new Gato());
        printConsulta(cahorros);
        printConsulta(gatos);
        List<Animal> animals = new ArrayList<>();
        printConsultaAnimal(animals);
    }

    private static void printConsulta(List<? extends Animal> animals){
        for (Animal animal : animals) {
            animal.consulta();
        }
    }

    private static void printConsultaAnimal(List<? super Animal> animals){
        Animal animal = new Cachorrro();
        Animal animal2 = new Gato();
        animals.add(new Cachorrro());
        animals.add(new Gato());
    }
}
