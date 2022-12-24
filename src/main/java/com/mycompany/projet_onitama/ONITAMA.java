/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projet_onitama;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author lucas
 */
public class ONITAMA extends javax.swing.JFrame {

    Grille grille = new Grille();
    Joueur[] ListeJoueurs = new Joueur[2];
    int cpt;
    Joueur JoueurCourant;
    Carte CarteCourante;
    int X = -1;
    int Y = -1;
    int choice;
    ArrayList<Carte> ListeCarte;
    Carte carte;
    ArrayList<Cellule> all_dep = new ArrayList<Cellule>();
    /**
     * Creates new form ONITAMA
     */
    public ONITAMA() {
        initComponents();
        
        ArrayList<String> colorlist = new ArrayList<String>(){{
            add("Rouge");
            add("Jaune");
            add("Bleu");
            add("Vert");
            add("Noir");
            add("Blanc");
        }};
        couleurj1.removeAllItems();
        couleurj2.removeAllItems();
        for(int k = 0; k < colorlist.size(); k++){
            couleurj1.addItem(colorlist.get(k));
            couleurj2.addItem(colorlist.get(k));
        }
        //Panneau_infos_joueurs.setVisible(false);
        for (int k = 0; k < 5; k++){
            for (int i = 0; i < 5; i ++){
                CelluleGraphique cellgraph = new CelluleGraphique(grille.CellulesJeu[k][i]);
                
                
                cellgraph.addActionListener(new java.awt.event.ActionListener() {
                    @Override
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        
                        System.out.println("Bouton activé");
                        Cellule c = cellgraph.CelluleAssociee;
                        
                        
                        switch(JoueurCourant.stade){
                            
                            case 0:
                                //choisir une carte
                                break;
                                
                            case 1:
                                //choisir un pion
                                if(cellgraph.CelluleAssociee.getpion() != null & cellgraph.CelluleAssociee.getpioncolor() == JoueurCourant.Couleur){
                                    all_dep = grille.deplacementspossibles(JoueurCourant, carte, cellgraph.CelluleAssociee.X, cellgraph.CelluleAssociee.Y);
                                    Y = cellgraph.CelluleAssociee.Y;
                                    X = cellgraph.CelluleAssociee.X;
                                    afficherdeppossibles(all_dep, true);
                                    JoueurCourant.stade++;
                                }
                                break;
                                
                            case 2:
                                //choisir la cellule finale
                                if(all_dep.contains(cellgraph.CelluleAssociee)){
                                    afficherdeppossibles(all_dep, false);
                                    Pion p = grille.CellulesJeu[X][Y].getpion();
                                    grille.CellulesJeu[X][Y].setpion(null);
                                    if(cellgraph.CelluleAssociee.getpioncolor() != JoueurCourant.Couleur & cellgraph.CelluleAssociee.getpioncolor() != ""){
                                        grille.recupererpionennemi(JoueurCourant, cellgraph.CelluleAssociee.getpion());
                                        
                                        if(JoueurCourant == ListeJoueurs[0]){
                                            ListeJoueurs[1].PionsRestant --;
                                        }else{
                                            ListeJoueurs[0].PionsRestant --;
                                        }
                                    }
                                    cellgraph.CelluleAssociee.setpion(p);
                                    Carte temp = carte;
                                    JoueurCourant.ListeCarte[choice] = CarteCourante;
                                    CarteCourante = temp;
                                    JoueurCourant.stade = 0;
                                    changerjoueur();
                                }
                                break;
                            }
                        grille.affichergrille();
                        affichage();
                        Grille.repaint();
                        
                        if(grille.etregagnantpourjoueur(ListeJoueurs[0])){
                            newgame.setEnabled(true);
                            for(int k = 0; k < 5; k++){
                                for(int i = 0; i < 5; i++){
                                    grille.CellulesJeu[k][i].setpion(new Pion(ListeJoueurs[0].Couleur, "pion"));
                                }
                            }
                        }
                        if(grille.etregagnantpourjoueur(ListeJoueurs[1])){
                            newgame.setEnabled(true);
                            for(int k = 0; k < 5; k++){
                                for(int i = 0; i < 5; i++){
                                    grille.CellulesJeu[k][i].setpion(new Pion(ListeJoueurs[1].Couleur, "pion"));
                                }
                            }
                        }
                        }
                });
                
                
                Grille.add(cellgraph);
            }
            Grille.repaint();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        Grille = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        nomj1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nomj2 = new javax.swing.JTextField();
        newgame = new javax.swing.JButton();
        couleurj1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        couleurj2 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        pionsmangesj1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        pionsresttantsj1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cartej11 = new javax.swing.JLabel();
        cartej12 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        pionsmangesj2 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        pionsresttantsj2 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        cartej21 = new javax.swing.JLabel();
        cartej22 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        cartecourante = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        joueurcourant = new javax.swing.JLabel();
        cartej21b = new javax.swing.JButton();
        cartej22b = new javax.swing.JButton();
        cartej11b = new javax.swing.JButton();
        cartej12b = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ONITAMA");
        setBackground(new java.awt.Color(204, 204, 204));
        setResizable(false);
        setSize(new java.awt.Dimension(1040, 661));

        title.setBackground(new java.awt.Color(204, 204, 204));
        title.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        title.setForeground(new java.awt.Color(255, 51, 0));
        title.setText("ONITAMA");

        Grille.setBackground(new java.awt.Color(255, 255, 255));
        Grille.setLayout(new java.awt.GridLayout(5, 5));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        nomj1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomj1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Nom du Joueur 1 :");

        jLabel2.setText("Nom du Joueur 2 :");

        nomj2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomj2ActionPerformed(evt);
            }
        });

        newgame.setText("Nouvelle Partie");
        newgame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newgameActionPerformed(evt);
            }
        });

        couleurj1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setText("Couleur Joueur 1");

        jLabel4.setText("Couleur Joueur 2");

        couleurj2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel9.setText("Création Partie");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(nomj1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(couleurj1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(couleurj2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(nomj2)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(newgame)
                        .addGap(69, 69, 69))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomj1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nomj2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(couleurj1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(couleurj2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(newgame)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel10.setText("- Infos Joueurs -");

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel11.setText("- Joueur 1 -");

        jLabel12.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel12.setText("- Joueur 2 -");

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));

        jLabel13.setText("Pions mangés :");

        pionsmangesj1.setText("0");

        jLabel14.setText("Pions Restant :");

        pionsresttantsj1.setText("0");

        jLabel15.setText("Cartes :");

        cartej11.setText("null");

        cartej12.setText("null");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pionsmangesj1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pionsresttantsj1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(cartej11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cartej12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pionsmangesj1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pionsresttantsj1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cartej12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cartej11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel5.setBackground(new java.awt.Color(0, 153, 153));

        jLabel16.setText("Pions mangés :");

        pionsmangesj2.setText("0");

        jLabel17.setText("Pions Restant :");

        pionsresttantsj2.setText("0");

        jLabel18.setText("Cartes :");

        cartej21.setText("null");

        cartej22.setText("null");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pionsmangesj2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pionsresttantsj2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(cartej21, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cartej22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pionsmangesj2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pionsresttantsj2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cartej21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cartej22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(65, 65, 65))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(0, 153, 153));

        jLabel21.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel21.setText("- Infos Jeu -");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("Carte Courante : ");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("Joueur Courant : ");

        joueurcourant.setText("null");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(jLabel20))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(cartecourante, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(joueurcourant, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel21)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addGap(3, 3, 3)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cartecourante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(joueurcourant, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                .addContainerGap())
        );

        cartej21b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartej21bActionPerformed(evt);
            }
        });

        cartej22b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartej22bActionPerformed(evt);
            }
        });

        cartej11b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartej11bActionPerformed(evt);
            }
        });

        cartej12b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartej12bActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Grille, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cartej21b, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cartej22b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cartej11b, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cartej12b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(title)
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cartej22b, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(cartej21b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Grille, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cartej11b, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(cartej12b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nomj1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomj1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomj1ActionPerformed

    private void nomj2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomj2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomj2ActionPerformed

    private void newgameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newgameActionPerformed
        // TODO add your handling code here:
        grille.vidergrille();
        cpt = 0;
        Joueur j1 = new Joueur(nomj1.getText());
        Joueur j2 = new Joueur(nomj2.getText());
        j1.PlayerNum = 0;
        j2.PlayerNum = 1;
        ListeJoueurs[0] = j1;
        ListeJoueurs[1] = j2;
        initialiserpartie();
        affichage();
        Grille.repaint();
        newgame.setEnabled(false);
        
    }//GEN-LAST:event_newgameActionPerformed

    private void cartej11bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartej11bActionPerformed
        // TODO add your handling code here:
        choice = 0;
        afficherdeppossibles(all_dep, false);
        carte = JoueurCourant.ListeCarte[0];
        JoueurCourant.stade = 1;
    }//GEN-LAST:event_cartej11bActionPerformed

    private void cartej12bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartej12bActionPerformed
        // TODO add your handling code here:
        choice = 1;
        afficherdeppossibles(all_dep, false);
        carte = JoueurCourant.ListeCarte[1];
        JoueurCourant.stade = 1;
    }//GEN-LAST:event_cartej12bActionPerformed

    private void cartej22bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartej22bActionPerformed
        // TODO add your handling code here:
        choice = 1;
        afficherdeppossibles(all_dep, false);
        carte = JoueurCourant.ListeCarte[1];
        JoueurCourant.stade = 1;
    }//GEN-LAST:event_cartej22bActionPerformed

    private void cartej21bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartej21bActionPerformed
        // TODO add your handling code here:
        choice = 0;
        afficherdeppossibles(all_dep, false);
        carte = JoueurCourant.ListeCarte[0];
        JoueurCourant.stade = 1;
    }//GEN-LAST:event_cartej21bActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ONITAMA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ONITAMA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ONITAMA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ONITAMA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ONITAMA().setVisible(true);
            }
        });
    }
    
    public void affichage(){
        pionsmangesj1.setText(ListeJoueurs[0].ListePionsEnnemi.size() + "");
        pionsmangesj2.setText(ListeJoueurs[1].ListePionsEnnemi.size() + "");
        pionsresttantsj1.setText(ListeJoueurs[0].PionsRestant + "");
        pionsresttantsj2.setText(ListeJoueurs[1].PionsRestant + "");
        joueurcourant.setText(JoueurCourant.Nom);
        cartecourante.setText(CarteCourante.Nom);
        cartej11.setText(ListeJoueurs[0].ListeCarte[0].Nom);
        cartej12.setText(ListeJoueurs[0].ListeCarte[1].Nom);
        cartej21.setText(ListeJoueurs[1].ListeCarte[0].Nom);
        cartej22.setText(ListeJoueurs[1].ListeCarte[1].Nom);
        //faire la carte courante
        cartej11b.setText(ListeJoueurs[0].ListeCarte[0].presentationcartegraphique());
        cartej12b.setText(ListeJoueurs[0].ListeCarte[1].presentationcartegraphique());
        cartej21b.setText(ListeJoueurs[1].ListeCarte[0].presentationcartegraphique());
        cartej22b.setText(ListeJoueurs[1].ListeCarte[1].presentationcartegraphique());
    }
    
    public void initialiserpartie(){
        
        JoueurCourant = ListeJoueurs[1];
        changerjoueur();
        
        String[] couleurs = attribuercouleursauxjoueurs();
        
        grille.CellulesJeu[4][0].PionCourant = new Pion(couleurs[0], "pion");
        grille.CellulesJeu[4][1].PionCourant = new Pion(couleurs[0], "pion");
        grille.CellulesJeu[4][2].PionCourant = new Pion(couleurs[0], "Dragon");
        grille.CellulesJeu[4][3].PionCourant = new Pion(couleurs[0], "pion");
        grille.CellulesJeu[4][4].PionCourant = new Pion(couleurs[0], "pion");
        
        grille.CellulesJeu[0][0].PionCourant = new Pion(couleurs[1], "pion");
        grille.CellulesJeu[0][1].PionCourant = new Pion(couleurs[1], "pion");
        grille.CellulesJeu[0][2].PionCourant = new Pion(couleurs[1], "Dragon");
        grille.CellulesJeu[0][3].PionCourant = new Pion(couleurs[1], "pion");
        grille.CellulesJeu[0][4].PionCourant = new Pion(couleurs[1], "pion");
        
        attribuercartes();
        
        //grille.affichergrille();
        
    }
    
    public String[] attribuercouleursauxjoueurs(){
        
        String[] couleurs = new String[2];
        
        ListeJoueurs[0].affectercouleur(couleurj1.getSelectedItem().toString());
        System.out.println("Le joueur : " + ListeJoueurs[0].Nom + " a la couleur " + ListeJoueurs[0].Couleur);
        couleurs[0] = couleurj1.getSelectedItem().toString();
        ListeJoueurs[1].affectercouleur(couleurj2.getSelectedItem().toString());
        System.out.println("Le joueur : " + ListeJoueurs[1].Nom + " a la couleur " + ListeJoueurs[1].Couleur);
        couleurs[1] = couleurj2.getSelectedItem().toString();
        
        return couleurs;
    }
    
    public void defcartes(){
        int[][] dep = {{0, -1}, {0, 1}, {1, 0}};
        ListeCarte.add(new Carte(dep, "Boar"));
        dep = new int[][] {{0, -1}, {-1, 1}, {1, 1}};
        ListeCarte.add(new Carte(dep, "Cobra"));
        dep = new int[][] {{0, -2}, {0, 2}, {1, 0}};
        ListeCarte.add(new Carte(dep, "Crab"));
        dep = new int[][] {{1, 0}, {-1, -1}, {-1, 1}};
        ListeCarte.add(new Carte(dep, "Crane"));
        dep = new int[][] {{1, -2}, {1, 2}, {-1, -1}, {-1, 1}};
        ListeCarte.add(new Carte(dep, "Dragon"));
        dep = new int[][] {{-1, -1}, {1, -1}, {0, 1}};
        ListeCarte.add(new Carte(dep, "Eel"));
        dep = new int[][] {{0, 1}, {0, -1}, {1, -1}, {1, 1}};
        ListeCarte.add(new Carte(dep, "Elephant"));
        dep = new int[][] {{0, -2}, {1, -1}, {-1, 1}};
        ListeCarte.add(new Carte(dep, "Frog"));
        dep = new int[][] {{0, -1}, {0, 1}, {1, -1}, {-1, 1}};
        ListeCarte.add(new Carte(dep, "Goose"));
        dep = new int[][] {{1, 0}, {-1, 0}, {0, -1}};
        ListeCarte.add(new Carte(dep, "Horse"));
        dep = new int[][] {{-1, 0}, {1, -1}, {1, 1}};
        ListeCarte.add(new Carte(dep, "Mantis"));
        dep = new int[][] {{1, 1}, {1, -1}, {-1, 1}, {-1, -1}};
        ListeCarte.add(new Carte(dep, "Monkey"));
        dep = new int[][] {{1, 0}, {-1, 0}, {0, 1}};
        ListeCarte.add(new Carte(dep, "Ox"));
        dep = new int[][] {{-1, -1}, {1, 1}, {0, 2}};
        ListeCarte.add(new Carte(dep, "Rabbit"));
        dep = new int[][] {{0, -1}, {0, 1}, {1, 1}, {-1, -1}};
        ListeCarte.add(new Carte(dep, "Rooster"));
        dep = new int[][] {{2, 0}, {-1, 0}};
        ListeCarte.add(new Carte(dep, "Tiger"));
    }
    
    public void attribuercartes(){
        ListeCarte = new ArrayList<Carte>();
        defcartes();
        Random r = new Random();
        for(int k = 0; k < 2; k++){
            for(int i = 0; i < 2; i++){
                int rand = r.nextInt(ListeCarte.size());
                ListeJoueurs[k].addcard(ListeCarte.get(rand));
                ListeCarte.remove(rand);
            }
        }
        int rand = r.nextInt(ListeCarte.size());
        CarteCourante = ListeCarte.get(rand);
        ListeCarte.remove(rand);
    }
    
    public void changerjoueur(){
        if(JoueurCourant == ListeJoueurs[1]){
            JoueurCourant = ListeJoueurs[0];
            cartej11b.setEnabled(true);
            cartej12b.setEnabled(true);
            cartej21b.setEnabled(false);
            cartej22b.setEnabled(false);
        }else{
            JoueurCourant = ListeJoueurs[1];
            cartej11b.setEnabled(false);
            cartej12b.setEnabled(false);
            cartej21b.setEnabled(true);
            cartej22b.setEnabled(true);
        }

        joueurcourant.setText(JoueurCourant.Nom);
    }
    
    public void afficherdeppossibles(ArrayList<Cellule> dep, boolean cond){
        for(int k = 0; k < dep.size(); k++){
            Cellule c = dep.get(k);
            c.deppossible = cond;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Grille;
    private javax.swing.JButton cartecourante;
    private javax.swing.JLabel cartej11;
    private javax.swing.JButton cartej11b;
    private javax.swing.JLabel cartej12;
    private javax.swing.JButton cartej12b;
    private javax.swing.JLabel cartej21;
    private javax.swing.JButton cartej21b;
    private javax.swing.JLabel cartej22;
    private javax.swing.JButton cartej22b;
    private javax.swing.JComboBox<String> couleurj1;
    private javax.swing.JComboBox<String> couleurj2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel joueurcourant;
    private javax.swing.JButton newgame;
    private javax.swing.JTextField nomj1;
    private javax.swing.JTextField nomj2;
    private javax.swing.JLabel pionsmangesj1;
    private javax.swing.JLabel pionsmangesj2;
    private javax.swing.JLabel pionsresttantsj1;
    private javax.swing.JLabel pionsresttantsj2;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
