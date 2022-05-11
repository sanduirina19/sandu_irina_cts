package main;

import clase.Autobuz;
import clase.AutobuzLinie;
import clase.Linie;
import clase.LinieFactory;

public class Main {
    public static void main(String[] args) {
        Autobuz a1 = new Autobuz("Dacia",2014,50);
        Autobuz a2 = new Autobuz("Dacia2",2013,20);
        Autobuz a3 = new Autobuz("Dacia3",2012,30);
        Autobuz a4 = new Autobuz("Dacia4",2011,40);

        LinieFactory factory=new LinieFactory();
        Linie l1= factory.getLinie(168);
        Linie l2= factory.getLinie(137);
        l1.afiseazaDescriere(a1);
        l1.afiseazaDescriere(a4);
        l2.afiseazaDescriere(a2);
        l2.afiseazaDescriere(a3);
    }
}
