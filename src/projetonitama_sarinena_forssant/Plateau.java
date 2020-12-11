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

    boolean PositionnerPionsDepart() { // ajoute les 10 jetons sur le plateau, disposés d'une certaine manière
        return true;
    }

    void ViderPlateau() { //vide le plateau en fin de partie // parcours la grille et initialise les données à 0 pour toutes les cellules, les trou noirs et les desintegrateurs
        for (int l = 0; l < 5; l++) {
            for (int c = 0; c < 5; c++) {
                Grille[l][c].PionCourant = null;
            }
        }
    }

    boolean CaseOccupee(int l, int c) { //renvoie si la case est occupée par un pion (adverse ou non)
        // BD : quelle case ? il manque les coordonnées en paramètre OK
        if (Grille[l][c].PionCourant != null) {
            System.out.println("case occupée par pion");
            return true;
        }
        return false;
    }

    String LireCouleurPion(int l, int c) { // renvoie la couleur du pion 
        // BD : la couleur de quel pion? celui qui est sur quelle cas? idem que précédent OK
        return Grille[l][c].PionCourant.CouleurPion;
    }

//methode alliant AjouterPion et SupprimerPion
// utilisée lors de la capture d'un pion adverse
    boolean RemplacerPion(int l, int c, Pion unPion){
        // BD : remplacer le pion de quelle case, par quoi ? manque coords et le nouveau pion OK
        if (Grille[l][c].PionCourant == null){
            return false;
        }
        if (Grille[l][c].PionCourant.CouleurPion == unPion.CouleurPion){
            return false;
        }
        else {
        unPion = Grille[l][c].PionCourant;
        return true;
        }
    }
    

    boolean SupprimerPion(int l, int c) { // supprime le pion du plateau
        if(Grille[l][c].PionCourant==null){ // vérifie que case soit non vide
        //System.out.println("Case vide");
        return false;
    }
    else{
        Grille[l][c].PionCourant=null; 
        //System.out.println("Suppression du jeton effectuée");
        return true;
    }       
// BD : sur quelle case on supprime le pion ?
    }

    //methode alliant ConditionPierre et ConditionRuisseau
    String EtreGagnant() {
        return null;
    }

    boolean ConditionPierre() { //condition 1 pour gagner
        return true;
    }

    boolean ConditionRuisseau() { // condition 2 pour gagner
        return true;
    }

    void AfficherPlateauSurConsole() {
        // affiche la grille dans la console

        for (int l = 5; l >= 0; l--) { // boucle décrémentée car l'affichage conventionnel et celui pris par les tableaux est inversé
            for (int c = 0; c < 5; c++) {
                if (Grille[l][c].PionCourant == null) {
                    System.out.print("N");
                } else if ((Grille[l][c].PionCourant.CouleurPion) != "Rouge") {
                    System.out.print("B");
                } else {
                    System.out.print("R");
                }

            }
            System.out.println(" " + (l + 1)); // affichage des numéros de lignes (l+1) car tableau commence à 0
        }
        for (int c = 0; c < 5; c++) {
            System.out.print((c + 1)); // affichage des colonnes (c+1) car tableau commence à 0
        }
        System.out.println(); // affichage global du tableau
    }

    // cases grises -> visualiser les potentiels mouvements de pions avec les cartes en main
    void PlacerCaseGrise(int l, int c, Carte uneCarte) {
        // BD : on place les case grises à partir d'un pion choisi par ses coordonnées, et d'une carte, non ? OK
        // ou sont ces éléments quand on appelle cette méthode ? DANS CETTE CLASSE

    }

    int[][] Mante = {{2, 1}, {1, 3}, {3, 3}};
    Carte CarteMante = new Carte("Mante", "Rouge", Mante);

    int[][] Singe = {{1, 1}, {1, 3}, {3, 1}, {3, 3}};
    Carte CarteSinge = new Carte("Singe", "Bleu", Singe);

    int[][] Cheval = {{2, 1}, {1, 2}, {2, 3}};
    Carte CarteCheval = new Carte("Cheval", "Rouge", Cheval);

    int[][] Boeuf = {{2, 1}, {3, 2}, {2, 3}};
    Carte CarteBoeuf = new Carte("Boeuf", "Bleu", Boeuf);

    int[][] Grue = {{1, 1}, {2, 3}, {3, 1}};
    Carte CarteGrue = new Carte("Grue", "Bleu", Grue);

    int[][] Sanglier = {{1, 2}, {2, 3}, {3, 2}};
    Carte CarteSanglier = new Carte("Sanglier", "Rouge", Sanglier);

    int[][] Anguille = {{1, 1}, {1, 3}, {3, 2}};
    Carte CarteAnguille = new Carte("Anguille", "Bleu", Anguille);

    int[][] Cobra = {{1, 2}, {3, 1}, {3, 3}};
    Carte CarteCobra = new Carte("Cobra", "Rouge", Cobra);
        
    int [][] Tigre = {{2,1},{2,4}};

        /*Carte CarteTigre = new Carte ("Tigre","Bleu", Tigre);
        int [][] Dragon = {​​{​​0;3}​​, {​​1,1}​​, {​​3,1}​​, {​​4,3}​​}​​; 
        Carte CarteDragon = new Carte (« Dragon », « Rouge », Dragon);
        int [][] Grenouille  = {​​{​​0;2}​​, {​​1,3}​​,{​​3,1}​​}​​; 
        Carte CarteGrenouille = new Carte (« Grenouille », « Bleu », Grenouille);
        int [][] Lapin = {​​{​​1;1}​​, {​​3,3}​​, {​​4,2}​​}​​; 
        Carte CarteLapin = new Carte (« Lapin », « Bleu», Lapin);
        int [][] Crabe = {​​{​​0;2}​​, {​​2,3}​​, {​​2,2}​​}​​; 
        Carte CarteCrabe = new Carte (« Crabe », « Bleu », Crabe);
        int [][] Elephant = {​​{​​1;2}​​, {​​1,3}​​, {​​3,2}​​, {​​3,3}​​}​​; 
        Carte CarteElephant = new Carte (« Elephant », « Rouge », Elephant);
        int [][] Oie = {​​{​​1;2}​​, {​​1,3}​​, {​​2,1}​​, {​​3,2}​​}​​; 
        Carte CarteOie = new Carte (« Oie », « Bleu », Oie);
        int [][] Coq = {​​{​​1;1}​​, {​​1,2}​​,{​​3,2}​​ ,{​​3,3}​​}​​; 
        Carte CarteCoq = new Carte (« Coq », « Rouge », Coq);*/
}
