/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetonitama_sarinena_forssant;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author lucie
 */
public class CaseGraphique extends JButton {

    Case CaseAssociee; // on va lui attribuer les caractéristiques des cellules du type console
    // Création des images en allant les chercher sur le bon emplacement
    // case vide/case roi/case pion/case grise
    ImageIcon img_vide = new javax.swing.ImageIcon(getClass().getResource("/images/celluleVide.png"));
    ImageIcon img_desint = new javax.swing.ImageIcon(getClass().getResource("/images/desintegrateur.png"));
    ImageIcon img_jetonJaune = new javax.swing.ImageIcon(getClass().getResource("/images/jetonJaune.png"));
    ImageIcon img_jetonRouge = new javax.swing.ImageIcon(getClass().getResource("/images/jetonRouge.png"));
    ImageIcon img_trouNoir = new javax.swing.ImageIcon(getClass().getResource("/images/trouNoir.png"));

    public CaseGraphique(Case uneCase) { // constructeur qui prend une cellule en paramètre
        CaseAssociee = uneCase;
    }

    @Override
    public void paintComponent(Graphics G) {
        super.paintComponent(G);
        if (CaseAssociee.EstRoi == true) {
            setIcon(img_trouNoir); // on attribue l'image lorsque la condition est vérifiée
        } else if (CaseAssociee.CaseGrise == true) {
            setIcon(img_desint);
        } else {
            String couleur_pion = CaseAssociee.LireCouleurDuPion();
            switch (couleur_pion) {
                case "vide":
                    setIcon(img_vide); // on attribue l'image celluleVide.png
                    break;
                case "Rouge":
                    setIcon(img_jetonRouge);
                    break;
                case "Bleu":
                    setIcon(img_jetonJaune);
                    break;
            }
        }
    }
}

