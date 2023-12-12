package academy.spirala.maratonajava.javacore.Zgenerics.test;

import academy.spirala.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Gandalf");
        list.add("Frodo");
        Smartphone smartphone = new Smartphone("111", "super phone");
        list.add(smartphone.toString());
        // etc.

        for (String o : list) {
            System.out.println(o);
        }

        add(list, smartphone); // O dado é inserido, mas dará uma ClassCastException se tentarmos imprimir.
    }

    public  static  void add(List list, Smartphone smartphone){
        list.add(smartphone);
    }
}
