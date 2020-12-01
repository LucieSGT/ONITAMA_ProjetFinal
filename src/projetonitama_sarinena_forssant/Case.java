/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetonitama_sarinena_forssant;

/**
 *
 * @author lucie
 */
public class Case {
    
    Pion PionCourant;
    boolean CaseGrise;
    
public Case () {
    PionCourant = null;
    CaseGrise = false;
} 

boolean AffecterPion(Pion unPion){
    if (PionCourant == null){
       PionCourant = unPion; 
       //System.out.println("pion affecté");
        return true;
    }
    else {
      //System.out.println("Un pion est déjà présent"); 
      return false;
    }
}

String LireCouleurDuPion(){
    if (PionCourant == null){
        return "vide";
    }
    else{
        return PionCourant.CouleurPion;
    }
}

boolean SupprimerPion(){
    if(PionCourant==null){
        //System.out.println("Case vide");
        return false;
    }
    else{
        PionCourant=null;
        //System.out.println("Suppression du pion effectuée");
        return true;
    }
}

boolean RemplacerPion(){ // en suspens
    return true;
}

}
