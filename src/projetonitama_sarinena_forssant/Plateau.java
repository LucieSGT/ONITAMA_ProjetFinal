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
public class Plateau {

    Case Grille[][] = new Case[5][5];

    public Plateau() { // constructeur qui à chaque case du tableau crée une référence objet de classe cellule
        for (int l = 0; l < 5; l++) {
            for (int c = 0; c < 5; c++) {
                Grille[l][c] = new Case();
            }
        }
    }
 boolean AjouterPion(){ // ajoute les 10 jetons sur le plateau, disposés d'une certaine manière
     return true;
 } 
 
 void ViderPlateau(){ //vide le plateau en fin de partie
     
 }
 
 boolean CaseOccupee(){ //renvoie si la case est occupée par un pion (adverse ou non)
     return true;
 }
 
 String LireCouleurPion(){ // renvoie la couleur du pion 
     return null;
 }
 
 //methode alliant AjouterPion et SupprimerPion
 // utilisée lors de la capture d'un pion adverse
 boolean RemplacerPion(){ 
     return true;
 }
 
 boolean SupprimerPion(){ // supprime le pion du plateau
     return true;
 }
 
 //methode alliant ConditionPierre et ConditionRuisseau
 String EtreGagnant(){
     return null;
 }
 
 boolean ConditionPierre(){ //condition 1 pour gagner
     return true;
 }
 
 boolean ConditionRuisseau(){ // condition 2 pour gagner
     return true;
 }
 
 
 // cases grises -> visualiser les potentiels mouvements de pions avec les cartes en main
 void PlacerCaseGrise(){
     
 }
 
 //+Dragons... (16)
    
}
