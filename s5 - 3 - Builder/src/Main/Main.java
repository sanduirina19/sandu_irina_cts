package Main;

import clase.Autobuz;
import clase.AutobuzBuilder;
import clase.AutobuzBuilderV2;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz, autobuz2, autobuz3;
        AutobuzBuilder builder = new AutobuzBuilder();
        autobuz = builder.build();
        autobuz2 = new AutobuzBuilder().setNumeSofer("Vasile").build();
        autobuz3 = new AutobuzBuilder().setStop(false).setNrInmatriculare("B333STB").build();

        System.out.println(autobuz);
        System.out.println(autobuz2);
        System.out.println(autobuz3);

        //StringBuilder strBuilder=new StringBuilder();
        //autobuz.setNrLinie(777); - nu ne permite

        AutobuzBuilderV2 builder2=new AutobuzBuilderV2();
        Autobuz a1 = builder2.setStop(true).setOpenDoors(true).setText("La multi ani").build();
        Autobuz a2 = builder2.setNumeSofer("Mihai").build();
        Autobuz a3 = builder2.build();
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

    }
}
