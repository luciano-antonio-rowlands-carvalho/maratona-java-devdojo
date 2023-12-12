package academy.spirala.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.spirala.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Jennifer Calendar";
        professor.idade = 41;
        professor.sexo = 'F';
        System.out.println("Nome: " + professor.nome + "; idade: " + professor.idade + "; sexo: " + professor.sexo);
    }
}
