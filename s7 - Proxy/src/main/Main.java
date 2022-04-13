package main;

import clase.Autobuz;
import clase.AutobuzDeNoapte;
import clase.MijlocTransport;

public class Main {
    public static void main(String[] args) {
        MijlocTransport autobuzNormal = new Autobuz(0,"Nume1");
        autobuzNormal.opresteInStatie();
        MijlocTransport autobuzDeNoapte = new AutobuzDeNoapte(autobuzNormal);
        autobuzDeNoapte.opresteInStatie();

        ((Autobuz)autobuzNormal).setNrCalatori(5);

        autobuzDeNoapte.opresteInStatie();
        autobuzDeNoapte.opresteInStatie();
    }
}
