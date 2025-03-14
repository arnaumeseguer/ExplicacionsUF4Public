package abstractes;

public abstract class Abstracta {

    // Metodes abstractes → no te implementacio
    public abstract int metodeAbstracte();

    public static void main(String[] args) {
        //Abstracta a = new Abstracta();
    }
}

abstract class FillaAbstracte extends Abstracta{

}

class FillaAbstracta2 extends Abstracta{

    @Override
    public int metodeAbstracte() {
        return 0;
    }
}