package main;

import adapter.Adapter;
import validatoareSubterane.ValidatorMetrou;
import validatoareSubterane.ValidatorSubteran;
import validatoareTerestre.ValidatorAutobuz;
import validatoareTerestre.ValidatorTerestru;

public class Main {
    public static void valideazaBilet(ValidatorTerestru validatorTerestru) {
        validatorTerestru.valideazaBilet();
    }

    public static void main(String[] args) {
        ValidatorTerestru validatorAutobuz = new ValidatorAutobuz();
        ValidatorSubteran validatorMetrou = new ValidatorMetrou();
        valideazaBilet(validatorAutobuz);
        Adapter adapter = new Adapter(validatorMetrou);
        valideazaBilet(adapter);
    }
}
