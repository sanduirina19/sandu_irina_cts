package clase;

public class Autobuz {
    private String numeSofer;
    private Integer consumMediu;
    private String model;
    private Integer anFabricatie;
    private Integer nrLocuri;

    public Autobuz(String numeSofer, Integer consumMediu, String model, Integer anFabricatie, Integer nrLocuri) {
        this.numeSofer = numeSofer;
        this.consumMediu = consumMediu;
        this.model = model;
        this.anFabricatie = anFabricatie;
        this.nrLocuri = nrLocuri;
    }

    public String getNumeSofer() {
        return numeSofer;
    }

    public void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    public Integer getConsumMediu() {
        return consumMediu;
    }

    public void setConsumMediu(Integer consumMediu) {
        this.consumMediu = consumMediu;
    }
    public AutobuzMemento genereazaMemento(){
        AutobuzMemento memento= new AutobuzMemento(numeSofer,consumMediu);
        return memento;
    }
    public void revineLaOStareAnterioara(AutobuzMemento autobuzMemento){
        this.consumMediu=autobuzMemento.getConsumMediu();
        this.numeSofer= autobuzMemento.getNumeSofer();

    }

}
