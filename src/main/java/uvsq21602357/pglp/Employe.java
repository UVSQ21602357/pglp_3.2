package uvsq21602357.pglp;

public class Employe extends AllEmploye{
    final private int salaire = 1500;
    private int AnneeDebut;
    public Employe(int AnneeDebut) {
        this.AnneeDebut=AnneeDebut;
    }
    @Override
    public double salaire(){
        return salaire+(2020-this.AnneeDebut)*20;
    }
}