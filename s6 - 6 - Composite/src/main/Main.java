package main;

import clase.Autobuz;
import clase.Grup;
import clase.NodAbstract;
import jdk.jshell.spi.ExecutionControl;

public class Main {
    public static void main(String[] args) {
        NodAbstract a1 = new Autobuz("Dacia", "aaa", 7);
        NodAbstract a2 = new Autobuz("Dacia", "aaa", 12);
        NodAbstract a3 = new Autobuz("Dacia", "aaa", 45);
        NodAbstract grupMici = new Grup("autobuze Mici");
        NodAbstract grupMari = new Grup("autobuze Mari");
        NodAbstract flota = new Grup("Flota");
        try {
            grupMici.addNodAbstract(a1);
            grupMici.addNodAbstract(a2);
            grupMari.addNodAbstract(a3);
            flota.addNodAbstract(grupMici);
            flota.addNodAbstract(grupMari);
            flota.afiseazaDescriere();
        } catch (ExecutionControl.NotImplementedException e) {
            e.printStackTrace();
        }
    }
}
