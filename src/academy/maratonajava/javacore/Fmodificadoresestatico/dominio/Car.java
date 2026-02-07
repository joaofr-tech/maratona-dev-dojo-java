package academy.maratonajava.javacore.Fmodificadoresestatico.dominio;

public class Car {
    private String name;
    private double speedMax;
    private static double speedLimit = 250;

    public Car(String name, double speedMax) {
        this.name = name;
        this.speedMax = speedMax;
    }

    public void imprime(){
        System.out.println("=========");
        System.out.println("Nome "+ this.name);
        System.out.println("Max Speed "+ this.speedMax);
        System.out.println("Limit Speed "+ Car.speedLimit);
    }

    public static void setSpeedLimit (double speedLimit){
        //Precisa do Car porque o Java sempre da prioridade a var local
        Car.speedLimit = speedLimit;
    }

    public static double getSpeedLimit(){
        return speedLimit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeedMax() {
        return speedMax;
    }

    public void setSpeedMax(double speedMax) {
        this.speedMax = speedMax;
    }

}
