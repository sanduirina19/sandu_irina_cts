package s1;

public class IngrijitorZOO {
    private String nume;

    public void hranesteAnimal(Animal animal, String mancare){
        animal.mananca(mancare);
    }

    public IngrijitorZOO(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
}
