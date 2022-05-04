package clase;

public class AutobuzMemento {
    private String numeSofer;
    private Integer consumMediu;


    public AutobuzMemento(String numeSofer, Integer consumMediu) {
        this.numeSofer = numeSofer;
        this.consumMediu = consumMediu;
    }

    public String getNumeSofer() {
        return numeSofer;
    }

    public Integer getConsumMediu() {
        return consumMediu;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutobuzMemento{");
        sb.append("numeSofer='").append(numeSofer).append('\'');
        sb.append(", consumMediu=").append(consumMediu);
        sb.append('}');
        return sb.toString();
    }
}
