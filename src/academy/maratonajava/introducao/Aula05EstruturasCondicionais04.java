package academy.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        byte dia = 5;
        // ctrl+alt+l == identa
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terca");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Dia nao existe");
        }

        char sexo = 'h';
        switch (sexo) {
            case 'm':
                System.out.println("its a boy");
                break;
            case 'n':
                System.out.println("its a girl");
                break;
            default:
                System.out.println("WHOO??");
        }
    }
}
