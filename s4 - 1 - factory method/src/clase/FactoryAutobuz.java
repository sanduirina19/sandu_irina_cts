package clase;

public class FactoryAutobuz implements Factory {
    @Override
    public MijlocTransportComun creareMijloc(String nrInmatriculare) {
        return new Autobuz(nrInmatriculare);
    }
}
