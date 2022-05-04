package clase;

public class Microbuz extends MijlocTransportComun{
    public Microbuz(String nrImatriculare) {
        super(nrImatriculare);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Microbuz{");
        sb.append("nrImatriculare='").append(nrImatriculare).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
