package uvsq21602357.pglp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.ArrayList;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void test(){
        Vendeur v1 = new Vendeur(16);
        Vendeur v2 = new Vendeur(45);
        Employe e1 = new Employe(2008);
        Employe e2 = new Employe(2016);
        ArrayList<AllEmploye> listeEmploye = new ArrayList<AllEmploye>();
        listeEmploye.add(e1);
        listeEmploye.add(e2);
        listeEmploye.add(v1);
        listeEmploye.add(v2);
        double SalaireTotal = 0;
        for(int i = 0; i < listeEmploye.size(); i++){
         SalaireTotal += listeEmploye.get(i).salaire();
        }
        System.out.println("Le salaire total est de : " + SalaireTotal);
        assertTrue(SalaireTotal == 7381.0);
    }
}