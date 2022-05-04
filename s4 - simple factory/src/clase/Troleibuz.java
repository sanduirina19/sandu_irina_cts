package clase;

public class Troleibuz extends MijlocTransportComun {

    public Troleibuz(String nrImatriculare) {
        super(nrImatriculare);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Troleibuz{");
        sb.append("nrImatriculare='").append(nrImatriculare).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
