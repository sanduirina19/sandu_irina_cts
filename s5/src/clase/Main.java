package clase;

public class Main {
    public static void main(String[] args) {
        Autobuz a1 = new Autobuz("nra1","Dorel");
        Tramvai t1= new Tramvai("nrt1","Gigel");

        try {
            MijlocTransport a2=  a1.copiaza();
            MijlocTransport t2 = t1.copiaza();
            System.out.println("Original: "+ a1);
            System.out.println("Original: "+ t1);
            System.out.println("Copie: "+ a2);
            System.out.println("Copie: "+ t2);
        }
        catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}
