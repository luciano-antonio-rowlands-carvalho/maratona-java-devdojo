package academy.spirala.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassesTest01 {
    private String name = "Buffy Summers";

    class Inner {
        public void printOuterClasseAttribute(){
            System.out.println(name);
            System.out.println("--------------------------------------------------");
            System.out.println("Este `this` refere-se a esta mesma classe, usando o sinal `$` para mostrar que é uma inner class:");
            System.out.println(this);
            System.out.println("--------------------------------------------------");
            System.out.println("Agora sim, o `this` que se refere à classe mais externa:");
            System.out.println(OuterClassesTest01.this);
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        OuterClassesTest01 outerClass = new OuterClassesTest01();
        Inner inner1 = outerClass.new Inner(); // uma forma
        Inner inner2 = new OuterClassesTest01().new Inner(); // outra forma
        inner1.printOuterClasseAttribute();
        inner2.printOuterClasseAttribute();
    }
}
