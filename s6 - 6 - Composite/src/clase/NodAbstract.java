package clase;

import jdk.jshell.spi.ExecutionControl;

public interface NodAbstract {
    void afiseazaDescriere();

    NodAbstract getNodAbstract(int poz) throws ExecutionControl.NotImplementedException;

    void addNodAbstract(NodAbstract nodAbstract) throws ExecutionControl.NotImplementedException;

    void removeNodAbstract(NodAbstract nodAbstract) throws ExecutionControl.NotImplementedException;
}
