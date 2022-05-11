package main;

import clase.CardBancar;
import clase.CardCalatorii;
import clase.Sms;
import clase.Validator;

public class Main {
    public static void main(String[] args) {
        Validator validator = new Validator(3,new CardCalatorii());
        validator.platesteCalatorie();
        validator.setModPlata(new CardBancar());
        validator.platesteCalatorie();
        validator.setModPlata(new Sms());
        validator.platesteCalatorie();
    }
}
