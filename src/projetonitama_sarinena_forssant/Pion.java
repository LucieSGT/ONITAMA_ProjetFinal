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
public class Pion {
    
    String CouleurPion;
    String Role;
    // BD : ok pour Role. On pouvait aussi le gérer en tant que boolean, ou rajouter une méthode etreRoi
public Pion (String uneCouleurPion, String unRole) { // constructeur qui passe le nom en paramètre et initialise les attributs
    CouleurPion = uneCouleurPion;
    Role = unRole;
} 

String LireCouleurPion(){ //retourne la couleur du pion
    return CouleurPion;
}

String LireRole(){ //retourne le role du pion (pion simple ou roi)
    return Role;
}
    
}
