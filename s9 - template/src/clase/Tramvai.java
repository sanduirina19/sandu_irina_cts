package clase;

public class Tramvai extends TramvaiAbstract{
    @Override
    protected void opresteStatie1() {
        System.out.println("Tramvaiul a oprit in statia 1");
    }

    @Override
    protected void opresteStatie2() {
        System.out.println("Tramvaiul a optrit in statia 2");
    }

    @Override
    protected void opresteStatie3() {
        System.out.println("Tramvaiull a oprit in statia 3");
    }
}
