package clase;

public class Tramvai extends MijlocTransport {
    public String numeVatman;

    public Tramvai(String numar, String numeVatman) {
        super(numar);
        this.numeVatman = numeVatman;
    }

    public String getNumeVatman() {
        return numeVatman;
    }

    public void setNumeVatman(String numeVatman) {
        this.numeVatman = numeVatman;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tramvai{");
        sb.append("numar='").append(this.getNumar()).append('\'');
        sb.append("numeVatman='").append(numeVatman).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public MijlocTransport copiaza() throws CloneNotSupportedException {
        return (MijlocTransport) this.clone();
    }
}
