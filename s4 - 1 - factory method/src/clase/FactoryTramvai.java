package clase;

public class FactoryTramvai implements Factory {

    @Override
    public MijlocTransportComun creareMijloc(String nrInmatriculare) {
        return new Tramvai(nrInmatriculare);
    }
}
