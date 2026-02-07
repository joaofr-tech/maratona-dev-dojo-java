package academy.maratonajava.javacore.Fmodificadoresestatico.test;

import academy.maratonajava.javacore.Fmodificadoresestatico.dominio.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car c1 = new Car("BMW", 280);
        Car c2 = new Car("Mercedes", 275);
        Car c3 = new Car("Audi", 290);

        Car.setSpeedLimit(180);

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
