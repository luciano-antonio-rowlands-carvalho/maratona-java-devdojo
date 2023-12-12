package academy.spirala.maratonajava.javacore.Ycolecoes.dominio;

public class Smartphone {
    private String serialNumber;
    private String marca;

    public Smartphone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    /*
    * Regras do equals sobrescrito:
    * Reflexivo: pode-se com parar x com x: x.equals(x), que tem que ser true para tudo que for diferente de null.
    * Simétrico: para x e y diferentes de null, se x.equals(y) == true, logo y.equals(x) == true.
    * Transitividade: para x, y e z diferentes de null, se x.equals(y)=true e x.equals(z)==true, logo y.equals(z)==true.
    * Consistente: para x != null, x.equals(x) sempre é == true.
    * para x diferente de null, x.equals(null)==false
    * */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        Smartphone smartphone = (Smartphone) obj;
        return serialNumber != null && serialNumber.equals(smartphone.serialNumber);
    }

    @Override
    public int hashCode() {
        return serialNumber == null ? 0 : this.serialNumber.hashCode();
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "serialNumber='" + serialNumber + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}