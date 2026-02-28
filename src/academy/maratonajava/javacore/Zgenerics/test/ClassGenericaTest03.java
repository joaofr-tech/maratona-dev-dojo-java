package academy.maratonajava.javacore.Zgenerics.test;

import academy.maratonajava.javacore.Zgenerics.dominio.Carro;
import academy.maratonajava.javacore.Zgenerics.sevice.CarroRentavelService;
import academy.maratonajava.javacore.Zgenerics.sevice.RentalService;
import java.util.ArrayList;
import java.util.List;

public class ClassGenericaTest03 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fusca")));
        RentalService<Carro> rentalService = new RentalService<>(carrosDisponiveis);
        Carro carro = rentalService.buscarOjetoDisponivel();
        System.out.println("Usando o carro por um mes...");
        rentalService.buscarOjetoDisponivel();
    }
}
