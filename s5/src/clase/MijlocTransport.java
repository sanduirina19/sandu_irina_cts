package clase;

public abstract class MijlocTransport implements Cloneable {
    public String numar;

    public MijlocTransport(String numar) {
        this.numar = numar;
    }

    public String getNumar() {
        return numar;
    }

    public void setNumar(String numar) {
        this.numar = numar;
    }

    public abstract MijlocTransport copiaza() throws CloneNotSupportedException;
}
