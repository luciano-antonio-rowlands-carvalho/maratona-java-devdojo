package academy.spirala.maratonajava.introducao;
/*
Prática:

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu, <nome>, morando no endereço <endereco>,
confirmo que recebi o salário de <salario>, na data <data>.
* */
public class Aula014TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Alexander Harris";
        String endereco = "Porão da casa dos pais";
        float salario = 1500F;
        String dataRecebimentoSalario = "10/12/2000";
        String reciboSalario = "Eu, " +nome+ ", morando no endereço " +endereco+ ", confirmo que recebi o salário de "+salario+ ", na data "+dataRecebimentoSalario+ ".";

        System.out.println(reciboSalario);
    }
}
