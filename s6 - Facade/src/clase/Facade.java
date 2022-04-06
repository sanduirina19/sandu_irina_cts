package clase;

public class Facade {
    private Autobuz autobuz;

    public Facade() {
        autobuz = new Autobuz();
    }
    public void deschideUsi()
    {
        autobuz.deschideUsaFata();
        autobuz.deschideUsaMijloc();
        autobuz.deschideUsaSpate();
    }
    public void liberUsi()
    {
        autobuz.liberUsaMijloc();
        autobuz.liberUsaFata();
        autobuz.liberUsaSpate();
    }
}
