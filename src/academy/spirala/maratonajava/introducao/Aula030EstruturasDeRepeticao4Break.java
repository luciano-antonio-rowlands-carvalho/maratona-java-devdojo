package academy.spirala.maratonajava.introducao;

public class Aula030EstruturasDeRepeticao4Break {
    public static void main(String[] args) {

        int parcelas;
        double valorTotal = 35800.50;
        double valorParcela;
        double valorFinalParcela = valorTotal;

        for (parcelas = 1; parcelas <= valorTotal; parcelas++) {
            valorParcela = valorTotal / parcelas;
            if (valorParcela < 1000) {
                parcelas -= 1;
                break;
            }
            valorFinalParcela = valorParcela;
        }

        System.out.println("O número máximo de parcelas é " + parcelas + ", no valor de " + valorFinalParcela + " cada uma.");

//        int parcelas = 1;
//        double totalCarro = 66350;
//        double valorParcelas = totalCarro;
//        double valorFinalParcelas = valorParcelas;
//
//        while (valorParcelas >= 1000) {
//            valorParcelas = totalCarro/parcelas;
//            if (valorParcelas < 1000) {
//                parcelas--;
//                break;}
//
//            valorFinalParcelas = valorParcelas;
//            parcelas++;
//        }
//
//        System.out.println("O número máximo de parcelas é " + parcelas + ", no valor de " + valorFinalParcelas + " cada uma.");
    }
}
