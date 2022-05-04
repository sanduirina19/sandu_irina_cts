package clase;

public class FactoryTroleibuz implements Factory {
    @Override
    public MijlocTransportComun creareMijloc(String nrInmatriculare) {
        return new Troleibuz(nrInmatriculare);
    }
}
