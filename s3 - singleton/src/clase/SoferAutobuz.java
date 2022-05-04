package clase;

public class SoferAutobuz {
    private String nume;
    private static SoferAutobuz soferAutobuz = null;

    public String getNume() {
        return nume;
    }

    private SoferAutobuz(String nume) {
        this.nume = nume;
    }

    public static synchronized SoferAutobuz getInstance(String nume) {
        if (soferAutobuz == null) {
            soferAutobuz = new SoferAutobuz(nume);
        }
        return soferAutobuz;
    }
}
