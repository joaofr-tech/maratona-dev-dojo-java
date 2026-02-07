package academy.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        int age = 18;
        String categoria;

        if (age < 15){
            categoria = "CATEGORIA INFANTIL";
        }
        else if(age >= 15 && age < 18){
            categoria = "CATEGORIA JUVENIL";
        }
        else {
            categoria = "CATEGORIA ADULTO";
        }
        System.out.println(categoria);
    }
}
