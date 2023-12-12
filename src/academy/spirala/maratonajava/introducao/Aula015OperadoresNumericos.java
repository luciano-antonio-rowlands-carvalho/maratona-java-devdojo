package academy.spirala.maratonajava.introducao;

public class Aula015OperadoresNumericos {
    public static void main(String[] args) {
        // Operadores aritméticos: + - * /
        int numero1 = 10;
        int numero2 = 20;
        double numero3 = 20;
        int soma = numero1 + numero2;
        int multiplicacao1 = numero1 * numero2;
        int divisao1 = numero1 / numero2; // 0, porque a variável divisao1 é int.
        double divisao2 = numero1 / numero2; //  0.0, porque a variável divisao2 é double mas as outras são int.
        double divisao3 = numero1 / numero3; // 0.5, porque o numero3 é double. Neste caso, a IDE não exibe um warning.

        int resto = 21 % 2; // resto = 1

        System.out.println(numero2 - numero1);
        System.out.println(numero2 + numero1);
        System.out.println("Valor: " + numero2 + numero1);
        System.out.println(numero2 + numero1 + " Valor: " + numero2 + numero1);
        System.out.println(soma);
        System.out.println("---------------------------------");
        System.out.println(multiplicacao1);
        System.out.println(numero2/numero1);
        System.out.println(divisao1);
        System.out.println(divisao2);
        System.out.println(divisao3);
        System.out.println(resto);
    }
}