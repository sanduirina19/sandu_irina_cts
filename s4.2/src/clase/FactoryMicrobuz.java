package clase;

public class FactoryMicrobuz implements Factory{
    @Override
    public MijlocTransportComun creareMijloc(String nrInmatriculare) {
        return new Microbuz(nrInmatriculare);
    }
}
