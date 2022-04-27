package clase;

public class Tramvai extends MijlocTransportHandler{

    public Tramvai(int pragDist) {
        super(pragDist);
    }

    @Override
    public void deplaseazaRequest(int dist) {
        if(dist<10){
            System.out.println("Mergi cu tramvaiul!");
        }
        else{
            getHandler().deplaseazaRequest(dist);
        }
    }
}
