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
    // BD : seulement 2 cartes en main pour un joueur
    Carte CarteCourante;
    // BD : carte courante c'est bien la carte qu'il s'apprete à jouer ?
    int NbreCartes;
    // BD : je ne comprends pas vraiment le NbreCartes. Il en a toujours 2 non ? (sauf au dévbut de la partie s'il en tire une puis lm'autre, mais ca reste pas pertinent à stocker
    // BD : edit : je l'ai compris avec AjouterCarte
    
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
