package academy.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // Concatenacao == Juntar valores de numeros
        // O resultado de 2 numeros inteiros, sempre sera um numero inteiro
        int number1 = 10;
        double number2 = 20;
        double sum = number1 / number2;
        System.out.println("Value: "+sum);

        //boolean comecar a variavel com is
        boolean isTenGraterThanTwent = 10 > 20;
        boolean isTenIqualTen = 10 == 10.0;
        System.out.println("isTenGraterThanTwent "+isTenGraterThanTwent);
        System.out.println("isTenEqualTen: "+isTenIqualTen);

        // && (AND)  || (OR)  ! (DIFERENTE)
        int personAge = 21;
        float salary = 3500F;
        boolean isInsideTheLawAboveTirty = personAge > 30 && salary >= 4612;
        boolean isInsideTheLawUnderTirty = personAge < 30 && salary >= 3381;
        if (isInsideTheLawAboveTirty || isInsideTheLawUnderTirty == true) {
            System.out.println("Everything right");
        }
        else {
            System.out.println("Need rebuild his salary");
        }

        double contaCorrente = 200;
        double contaPoupanca = 3000;
        double PS5 = 5000;
        boolean isHaveMoney = PS5 < contaPoupanca || PS5 < contaCorrente;
        if (isHaveMoney == true){
            System.out.println("You have the money");
        }
        else{
            System.out.println("You need more money, sorry man");
        }
        // = += -= /= %=
        double bonus = 1800;
        bonus += 2000;
        bonus /= 2;
        System.out.println(bonus);
    }
}
