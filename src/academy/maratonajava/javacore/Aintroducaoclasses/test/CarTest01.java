package academy.maratonajava.javacore.Aintroducaoclasses.test;

import academy.maratonajava.javacore.Aintroducaoclasses.dominio.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.name = "HB20";
        car1.model = "Hyundai HB20";
        car1.year = 2012;

        car2.name = "Civic";
        car2.model = "Honda Civic";
        car2.year = 2015;

        System.out.println(car1.name);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println("--------------------------");
        System.out.println(car2.name);
        System.out.println(car2.model);
        System.out.println(car2.year);
    }
}
