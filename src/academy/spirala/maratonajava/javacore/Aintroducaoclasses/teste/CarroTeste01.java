package academy.spirala.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.spirala.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Escort";
        carro1.modelo = "LS";
        carro1.ano = 1986;

        carro2.nome = "Monza";
        carro2.modelo = "LS";
        carro2.ano = 1988;

        System.out.println("Carro 1: " + carro1.nome + " " + carro1.modelo  + " " + carro1.ano);
        System.out.println("\nCarro 2: " + carro2.nome + " " + carro2.modelo  + " " + carro2.ano);
    }
}
