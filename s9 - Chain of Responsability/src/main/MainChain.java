package main;

import clase.*;

public class MainChain {
    public static void main(String[] args) {
        MijlocTransportHandler troleibuz= new Troleibuz(3);
        MijlocTransportHandler autobuz= new Autobuz(5);
        MijlocTransportHandler tramvai= new Tramvai(10);
        MijlocTransportHandler metrou= new Metrou(1000);
        troleibuz.setHandler(autobuz);
        autobuz.setHandler(tramvai);
        tramvai.setHandler(metrou);
        int dist=20;
        troleibuz.deplaseazaRequest(dist);

        MijlocTransportHandler autoobuzArad= new Autobuz(1000);
        MijlocTransportHandler tramvaiArad = new Tramvai(2);

        tramvaiArad.deplaseazaRequest(5);

    }
}
