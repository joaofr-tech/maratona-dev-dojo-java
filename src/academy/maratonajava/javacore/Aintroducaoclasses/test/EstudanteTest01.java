package academy.maratonajava.javacore.Aintroducaoclasses.test;

import academy.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.name = "Julio";
        estudante.age = 12;
        estudante.sex = 'm';

        System.out.println(estudante.name);
        System.out.println(estudante.age);
        System.out.println(estudante.sex);
        System.out.println(estudante);
    }
}
