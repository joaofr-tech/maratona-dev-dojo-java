package academy.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int age = 12;
        boolean isCanBuyDrink = age >= 18;
        if(isCanBuyDrink){
            System.out.println("You can drink");
        }
        if (!isCanBuyDrink){
            System.out.println("You cant drink yet");
        }
    }
}
