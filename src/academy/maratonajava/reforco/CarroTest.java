package academy.maratonajava.reforco;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Corolla";
        carro1.modelo = "Sedan";
        carro1.ano = 2012;
        carro2.nome = "Fusca";
        carro2.modelo = "antigo";
        carro2.ano = 2001;
        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);
    }
}
