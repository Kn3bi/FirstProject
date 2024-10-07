public class Fahrzeug {

    // Attribute
    private int ps;
    private String hersteller;



    // Referenzen
    private Person fahrer, beifahrer;

    // Methoden
    public Fahrzeug(int ps, String hersteller){
        this.ps = ps;
        this.hersteller = hersteller;
    }

    public int getPS() {
        return ps;
    }

    public void setPS(int ps) {
        if ( ps <= 200 ) {
            this.ps = ps;
        } else {
            System.out.println("FEHLER: PS darf nicht größer als 200 sein.");
        }
    }

    public String getHersteller(){
        return hersteller;
    }

    public void setHersteller(String hersteller){
        this.hersteller = hersteller;
    }

    public Person getBeifahrer() {
        return beifahrer;
    }

    public void setBeifahrer(Person beifahrer) {
        if ( beifahrer == fahrer){
            System.out.println("FEHLER: Der Beifahrer kann nicht gleichzeitig der Fahrer sein!");
        } else {
            this.beifahrer = beifahrer;
            System.out.println(beifahrer.getName()+" ist in das Auto "+this.getHersteller()+" mit "+this.getPS()+" PS als Beifahrer eingestiegen.");
        }
    }

    public Person getFahrer() {
        return fahrer;
    }

    public void setFahrer(Person fahrer) {
        this.fahrer = fahrer;
        System.out.println(fahrer.getName()+" ist in das Auto "+this.getHersteller()+" mit "+this.getPS()+" PS als Fahrer eingestiegen.");
    }

    public void nenneBesatzung(){
        System.out.println(fahrer.getName()+" ist im Auto "+this.getHersteller()+" mit "+this.getPS()+" PS als Fahrer und "+this.getBeifahrer().getName()+" ist Beifahrer.");
    }

}
