package polimorfisme;

public class SuperClasse {

    //Propietats
    protected int prop=23;

    //Mètodes sobrecarregats → polimorifsme part 1
    public void metode(){
        System.out.println("Soc un mètode sense paràmetres");
    }
    public int metode(int param){
        System.out.println("Soc un mètode sense paràmetres");
        return 1;
    }
    public int metode(float param2){
        System.out.println("Soc un mètode sense paràmetres");
        return 1;
    }

    //Mètode per ser sobreescrit (Override → Inavildat. Però santi diu sobreescrit)
    public void metodeSobreescrit(){
        System.out.println("Seré un mètode sobreescrit");
    }

    //Mètode que no pot ser sobreescrit
    public final void metodeFinal(){
        System.out.println("Soc un mètode que no pot ser sobreescit");
    }

    public static void main(String[] args) {
        int i;
        SuperClasse s = new SuperClasse();

        int j = s.metode(34);

        SubClasse f=new SubClasse();

        System.out.println(f.prop);

        f.metodeSobreescrit();

        SuperClasse s2=(SuperClasse)f;
        System.out.println(s2.prop);
    }


}


class SubClasse extends SuperClasse{
    //Propietats
    public int prop;       //Propietat sobreescrita


    //Mètode sobreescrit → polimorfisme part 2
    @Override
    public void metodeSobreescrit() {
        System.out.println("Ja soc un mètode sobreescrit...");
        System.out.println("la meva prop val " + this.prop); //El "this" no fa falta, es només per aclarir que és la filla
        System.out.println("i la de mon pare val " + super.prop);
    }
}



