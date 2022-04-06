package validatoareTerestre;

public class ValidatorAutobuz implements ValidatorTerestru {
    @Override
    public void valideazaBilet() {
        System.out.println("A fost validdat biletul pentru autobuz!");
    }

    @Override
    public void valideazaAbonament() {
        System.out.println("A fost validat abonamentul pentru autobuz!");
    }
}
