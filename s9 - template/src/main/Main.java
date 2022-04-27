package main;

import clase.Tramvai;
import clase.TramvaiAbstract;
import clase.TramvaiProbe;

public class Main {
    public static void main(String[] args) {
        TramvaiAbstract tramvai = new Tramvai();
        TramvaiAbstract tramvaiProbe= new TramvaiProbe();
        tramvai.parcurgereTraseu();
        tramvai.parcurgereTraseuInvers();
        System.out.println();
        tramvaiProbe.parcurgereTraseu();
        tramvaiProbe.parcurgereTraseuInvers();
    }
}
