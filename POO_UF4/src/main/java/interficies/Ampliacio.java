package org.example.interficies;

import java.io.Serializable;

public interface Ampliacio {

    void noFaigRes();

    //void ampliacio();

}

interface NovaAmpliacio extends Ampliacio {

    void ampliacio();
}

interface NovaAmpliacio2 extends Ampliacio, Serializable { // PREGUNTA EXAMEN: Les inferfícies tenen herència multiple amazing

}

class Verga extends Object implements NovaAmpliacio, Serializable { // Les classes tenen herencia simple i implementacio multiple

    @Override
    public void noFaigRes() {

    }

    @Override
    public void ampliacio() {

    }

    interface int1 {
        abstract void metodeAbstracte();
    }

    interface int2 {
        abstract void metodeAbstracte();
    }

    interface implements int2{
        int1 i = new int1();

        i.metodeAbstracte();
    }
}
