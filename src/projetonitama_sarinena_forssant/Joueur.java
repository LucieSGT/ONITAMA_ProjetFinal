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
public class Joueur {
    
    String NomJoueur;
    String CouleurJoueur;
    Carte CarteEnMain[] = new Carte[3];
    Carte CarteCourante;
    int NbreCartes;
    
    
public Joueur (String unNomJoueur) { // constructeur qui passe le nom en paramètre et initialise les attributs
    NomJoueur = unNomJoueur;
    NbreCartes = 0;
}  

void AffecterCouleur (String uneCouleurJoueur){ // affecte la couleur en paramètre au joueur
    CouleurJoueur = uneCouleurJoueur ;
}

void AjouterCarte(Carte unNomCarte){ //ajoute les cartes au joueur +1 au plateau
    CarteEnMain[NbreCartes++] = unNomCarte;
}

String CouleurDuJoueur(){ // création de cette méthode pour récupérer la couleur dans la classe grille
    return CouleurJoueur;
}

// le joueur joue la carte selectionnee
//la carte va ensuite être mechngée avec celle qui etait au bord du plateau

boolean UtiliserCarte (Carte NomCarte){
   return true;
}

}
