package uvsq21602357.pglp;

public class Manager extends AllEmploye {

    private final int base=1500;
    private int nombreEmployes;
    public Manager(int nombreEmployes){
        this.nombreEmployes=nombreEmployes;
    }

    @Override
    public double salaire() {
        return base+(nombreEmployes*100);
    }
}
