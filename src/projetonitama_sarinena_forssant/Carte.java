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
public class Carte {
    
    String NomCarte;
    int Matrice[][] = new int[5][5];

public Carte (String unNom) { // constructeur qui passe le nom en paramètre et initialise les attributs
    NomCarte = unNom;
    // BD : je rajouterai un second parametre permettant de remplir la matrice pour chaque carte
}  

String LireCarte(){ //Retourne au joueur le nom de la carte
   return NomCarte;
}

String MouvementPossible(){ //retourne au joueur une matrice 5x5 avec l'action qu'il peut jouer
    // BD : manque un vecteur en paramètre désignant le moouvement
    return null;
}
       
}
