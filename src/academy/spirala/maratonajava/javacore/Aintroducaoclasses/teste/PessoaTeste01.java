package academy.spirala.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.spirala.maratonajava.javacore.Aintroducaoclasses.dominio.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.nome = "Anya";
        pessoa.idade = 1000;
        pessoa.genero = 'F';

        System.out.println(pessoa.nome);
        System.out.println(pessoa.idade);
        System.out.println(pessoa.genero);
        System.out.println(pessoa);
    }
}
