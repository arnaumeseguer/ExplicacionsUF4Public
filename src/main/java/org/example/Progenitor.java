package org.example;

public class Progenitor {
    private int popEnter;
    protected boolean propLogica;
    char propCaracter;
    public double propDecimal;

    public static String getPropStringEstatica() {
        return propStringEstatica;
    }

    public static void setPropStringEstatica(String propStringEstatica) {
        Progenitor.propStringEstatica = propStringEstatica;
    }

    private static String propStringEstatica;
}

class Filla extends Progenitor {

}

class Prova{
    public static void main(String[] args) {
        Filla filla = new Filla();
        filla.propCaracter = 'c';

    }
}