package main;

import clase.Autobuz;
import clase.ManagerAutobuz;

public class main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz("Andrei",4,"Dacia",2000,25);
        ManagerAutobuz manager = new ManagerAutobuz();
        manager.adaugaMememnto(autobuz.genereazaMemento());
        autobuz.setNumeSofer("Viorel");
        System.out.println(autobuz.toString());
        manager.adaugaMememnto(autobuz.genereazaMemento());
        autobuz.setConsumMediu(7);
        manager.adaugaMememnto((autobuz.genereazaMemento()));
        System.out.println(autobuz.toString());
        autobuz.revineLaOStareAnterioara(manager.getMemento(0));
        System.out.println(autobuz.toString());

    }
}
