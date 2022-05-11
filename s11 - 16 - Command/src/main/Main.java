package main;

import clase.Autobuz;
import clase.Comanda;
import clase.ComandaPlecareTraseu;
import clase.Operator;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz1 = new Autobuz("B.12.CTS");
        Autobuz autobuz2 = new Autobuz("B.10.CTS");
        Comanda comanda1 = new ComandaPlecareTraseu(1,autobuz1);
        Operator operator = new Operator();
        operator.addComanda(comanda1);
        operator.addComanda(new ComandaPlecareTraseu(2,autobuz1));
        operator.addComanda(new ComandaPlecareTraseu(2,autobuz2));
        operator.addComanda(new ComandaPlecareTraseu(4,autobuz1));

        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
    }
}
