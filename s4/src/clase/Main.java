package clase;

public class Main {
    public static void main(String[] args) {
        MijlocTransportComun mijloc1 = Factory.creareMijlocTransport(TipMijlocTransport.Autobuz, "nrAutobuz");
        MijlocTransportComun mijloc2 = Factory.creareMijlocTransport(TipMijlocTransport.Troleibuz, "nrTroleibuz");
        MijlocTransportComun mijloc3 = Factory.creareMijlocTransport(TipMijlocTransport.Tramvai, "nrTramvai");

        System.out.println(mijloc1.getNrImatriculare());
        System.out.println(mijloc2.getNrImatriculare());
        System.out.println(mijloc3.getNrImatriculare());

    }
}
