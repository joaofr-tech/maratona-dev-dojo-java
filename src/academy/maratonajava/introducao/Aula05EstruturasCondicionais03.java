package academy.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double sal =  7000;
        String mensagemDoar =  "Vou doar 500 pila";
        String mensagemNaoDoar =  "Nao vou doar ainda";
        //OperadorTernario == (condicao) ? verdadeiro : falso;
        String finalmenssage = sal > 5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(finalmenssage);

    }
}
