package clase;

public class Autobuz {
    private String nrInmatriculare;

    public Autobuz(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }
    public void plecarePeTraseu(int nrLinie){
        System.out.println("Autobuzul cu numarul "+nrInmatriculare+ " a plecat pe traseu pe linia " + nrLinie);
    }
}
