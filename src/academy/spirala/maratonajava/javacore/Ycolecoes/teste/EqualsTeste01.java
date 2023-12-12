package academy.spirala.maratonajava.javacore.Ycolecoes.teste;

import academy.spirala.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

public class EqualsTeste01 {
    public static void main(String[] args) {
/*        String nome1 = "Phillip Coulson";
        String nome2 = "Phillip Coulson";
        String nome3 =  new String("Phillip Coulson");

        System.out.println(nome1 == nome2);
        System.out.println(nome1 == nome3);
        System.out.println(nome1.equals(nome3));
*/
        Smartphone smartphone1 = new Smartphone("103Sk8bb", "iPhone");
        Smartphone smartphone2 = new Smartphone("103Sk8bb", "iPhone");

        System.out.println(smartphone1.equals(smartphone2));
    }
}