/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlleur;

import controlleur.EnumTypeEcran;
import metier.Commande;

/**
 *
 * @author eliseevilliard
 */
public class TraiterAjoutPanierReponse {
        public EnumTypeEcran typeEcran;
        public Commande laCommande;
        
        public TraiterAjoutPanierReponse(){
            typeEcran = EnumTypeEcran.ECRAN_PANIER;
        }
}
