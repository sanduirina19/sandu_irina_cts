package main;

import s1.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        IngrijitorZOO ingr_zoo1=new IngrijitorZOO("Ingrijitor1");
        ZOO z1=new ZOO("ZOO1",ingr_zoo1);
        Zebra zebra1= new Zebra("zebra1");
        Zebra zebra2= new Zebra("zebra2");
        Girafa girafa1=new Girafa("girafa1");

        z1.addAnimal(zebra1);
        z1.addAnimal(zebra2);
        z1.addAnimal(girafa1);

        z1.hranesteAnimale("mancare");
    }
}
