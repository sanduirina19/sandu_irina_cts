package clase;

import jdk.jshell.spi.ExecutionControl;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Grup implements NodAbstract {
    private List<NodAbstract> lista = new ArrayList<>();
    private String denumire;

    public Grup(String denumire) {
        super();
        lista = new ArrayList<>();
        this.denumire = denumire;
    }


    @Override
    public void afiseazaDescriere() {
        System.out.println("Denumirea grupului: " + this.denumire);
        for (NodAbstract i : lista) {
            i.afiseazaDescriere();
        }

    }

    @Override
    public NodAbstract getNodAbstract(int poz) throws ExecutionControl.NotImplementedException {
        return lista.get(poz);
    }

    @Override
    public void addNodAbstract(NodAbstract nodAbstract) throws ExecutionControl.NotImplementedException {
        lista.add(nodAbstract);
    }

    @Override
    public void removeNodAbstract(NodAbstract nodAbstract) throws ExecutionControl.NotImplementedException {
        lista.remove(nodAbstract);
    }
}
