package academy.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        double ValorTotal = 30000;
        for (int parcela = (int) ValorTotal; parcela >= 1; parcela--) {
            double ValorParcela = ValorTotal / parcela;
            if(ValorParcela < 1000){
                continue;
            }
            System.out.println("Parcela " + parcela + ": RS " + ValorParcela);
        }
    }
}
