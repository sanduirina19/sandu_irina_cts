package clase;

import jdk.jshell.spi.ExecutionControl;

public class Autobuz implements NodAbstract {
    private String producator;
    private String model;
    private int nrLocuri;

    public Autobuz(String producator, String model, int nrLocuri) {

        this.producator = producator;
        this.model = model;
        this.nrLocuri = nrLocuri;
    }

    public String getProducator() {
        return producator;
    }

    public void setProducator(String producator) {
        this.producator = producator;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNrLocuri() {
        return nrLocuri;
    }

    public void setNrLocuri(int nrLocuri) {
        this.nrLocuri = nrLocuri;
    }

    @Override
    public void afiseazaDescriere() {
        this.toString();
    }

    @Override
    public NodAbstract getNodAbstract(int poz) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException(null);
    }

    @Override
    public void addNodAbstract(NodAbstract nodAbstract) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException(null);

    }

    @Override
    public void removeNodAbstract(NodAbstract nodAbstract) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException(null);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("producator='").append(producator).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append('}');
        return sb.toString();
    }
}
