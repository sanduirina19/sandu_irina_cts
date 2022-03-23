package clase;

public class Autobuz extends MijlocTransportComun {

    public Autobuz(String nrImatriculare) {
        super(nrImatriculare);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("nrImatriculare='").append(nrImatriculare).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
