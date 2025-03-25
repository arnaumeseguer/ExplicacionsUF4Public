package enumeracions;

public enum Explicacio {
    //Serveix per a catalogar
    DAVANT, DARRERA, ESQUERRA, DRETA
}

class Vehicle2{
    private String nom = "Cotxe";
    private double cilindrada;
    Explicacio direccio;
    //Volem fer la direccio pero en enums

    public void direccio(Explicacio direccio){
        this.direccio = direccio;
    }

    public String toString(){
        return "Vehicle{" +
                "nom='" + nom + '\'' +
                ", cilindrada=" + cilindrada +
                ", Direccio='" + direccio + '\'' +
                '}';
    }
}

class mostra{
    public static void main(String[] args) {
        Vehicle2 v = new Vehicle2();
        v.direccio(Explicacio.DAVANT);

        System.out.println(v.toString());
    }
}