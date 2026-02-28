package academy.maratonajava.javacore.Zgenerics.test;

import academy.maratonajava.javacore.Zgenerics.dominio.Carro;
import academy.maratonajava.javacore.Zgenerics.sevice.CarroRentavelService;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscarCarroDisponivel();
        System.out.println("Usando o carro por um mes...");
        carroRentavelService.retornarCarroAlugado(carro);
    }
}
