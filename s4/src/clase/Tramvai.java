package clase;

public class Tramvai extends MijlocTransportComun {

    public Tramvai(String nrImatriculare) {
        super(nrImatriculare);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tramvai{");
        sb.append("nrImatriculare='").append(nrImatriculare).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
