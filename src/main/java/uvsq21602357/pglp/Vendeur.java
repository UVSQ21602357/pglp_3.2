package uvsq21602357.pglp;

public class Vendeur extends AllEmploye{
    final private int base=2000;
    private int commission;
    public Vendeur(int comission){
        this.commission=comission;
    }
    @Override
    public double salaire(){
        return base+commission;
    }
}
