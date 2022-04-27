package clase;

public class TramvaiProbe extends TramvaiAbstract{
    @Override
    protected void opresteStatie1() {
        System.out.println("Tramvaiul pleaca din statia 1");
    }

    @Override
    protected void opresteStatie2() {
        System.out.println("Nu opreste in statia 2");
    }

    @Override
    protected void opresteStatie3() {
        System.out.println("Tramvaiul pleaca din statia 3");
    }
}
