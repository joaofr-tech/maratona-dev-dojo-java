package academy.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String name;
    private int age;
    private double[] sal;
    private double averageSal;

    public void imprimi(){
        System.out.println(this.name);
        System.out.println(this.age);
        for (int i = 0; i < sal.length; i++) {
            System.out.print(this.sal[i]+" ");
        }
    }

    public void imprimeAverageSal(){
        double average = 0;
        for (int i = 0; i < sal.length; i++) {
            average =+ this.sal[i];
        }
        average /= sal.length;
        System.out.println("\nAverage: "+average);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double[] getSal() {
        return sal;
    }

    public void setSal(double[] sal) {
        this.sal = sal;
    }

    public void setAverageSal(double averageSal) {
        this.averageSal = averageSal;
    }
}

