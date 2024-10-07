public class MainControl {

    //Referenzen
    private Person p1, p2;
    private Fahrzeug f1;


    public static void main(String[] args) {
        new MainControl();
    }

    public MainControl(){
        p1 = new Person("Peter",12);
        p2 = new Person("Bob",13);
        f1 = new Fahrzeug(80,"VW");
        simuliereDinge();
    }

    private void simuliereDinge(){
        f1.setPS(210);
        f1.setFahrer(p1);
        f1.setBeifahrer(p2);
        f1.nenneBesatzung();
    }

}