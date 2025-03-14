package polimorfisme;

public class SuperClasse {

    //Propietats
    protected int propietat=23;
    public static final String nom = "Pepe"; // Propietat final o mes coneguda com a constant

    //metodes sobrecarregats → polimorfisme part 1

    public void metodeSobrecarregat(){
        System.out.println("Soc un metode sense parametres");
    }

    public int metodeSobrecarregat(int param){
        System.out.println("Soc un metode sense parametres");
        return 1;
    }

    public int metodeSobrecarregat(float param){
        System.out.println("Soc un metode sense parametres");
        return 1;
    }

    // Metode sobreescrit

    public void metodeSobreEscit(){
        System.out.println("Sere un metode sobreescrit");
    }

    //Els metodes finals no es poden sobreescriure
    public final void metodeFinal(){
        System.out.println("Soc un metode final, i no pot ser sobreescrit");
    }

    public static void main(String[] args) {
        SuperClasse superClasse = new SuperClasse();
        int j = superClasse.metodeSobrecarregat(34);

        SubClasse f = new SubClasse();

        System.out.println(f.propietat);

        f.metodeSobreEscit();

        SuperClasse s2 = (SuperClasse)f;
        System.out.println(s2.propietat);
    }
}

class SubClasse extends SuperClasse {

    // Propietats
    public int propietat; //propietat sobreescrita

    //Metode sobreescrit → polimorfisme part 2
    @Override
    public void metodeSobreEscit() {
        System.out.println("Ja soc un metode sobreescrit");
        System.out.println("La meva propietat val "+propietat);
        System.out.println("I la de mun pare val "+super.propietat);
    }
}

// Classe que no es pot estendre → no pot tindre descendencia
// No podem estendre una classe final :D

final class Esteril{

}
