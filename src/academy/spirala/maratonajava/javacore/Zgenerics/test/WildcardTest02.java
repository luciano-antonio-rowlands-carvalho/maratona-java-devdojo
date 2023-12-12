package academy.spirala.maratonajava.javacore.Zgenerics.test;


import java.util.List;

public class WildcardTest02 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());
        // Estas chamadas não podem ser feitas; dão erro de compilação:
        // printConsulta(cachorros);
        // printConsulta(gatos);
    }

    public static void printConsulta(List<Animal> animals){
        for (Animal animal : animals) {
            animal.consulta();
            animals.add(new Cachorro());
        }
    }
}
