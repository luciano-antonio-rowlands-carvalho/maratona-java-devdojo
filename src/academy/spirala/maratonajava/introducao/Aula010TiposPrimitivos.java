package academy.spirala.maratonajava.introducao;

public class Aula010TiposPrimitivos {
    public static void main(String[] args) {
        int someInt = (int) 10000000000L;
        long someLong = (long) 155.55D;
        double someDouble = 2000.0;
        float someFloat = (float) 2500.0D;
        byte someByte = 10;
        short someShort = 10;
        boolean trueBoolean = true;
        boolean falseBoolean = false;
        char someChar = '\u0041';
        String texto = "Qualquer texto, mesmo que seja graaaaaaaaaaande.";
        String nome = "Luciano";

        System.out.println(falseBoolean);
        System.out.println(someChar);
        System.out.println(someInt);
        System.out.println(someFloat);
        System.out.println(someLong);
        System.out.println(texto);
        System.out.println("Oi. Meu nome é " + nome);
    }
}
