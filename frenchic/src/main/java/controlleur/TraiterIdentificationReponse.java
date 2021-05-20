/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlleur;

import controlleur.EnumTypeEcran;
import metier.Client;
import metier.Produit;

/**
 *
 * @author eliseevilliard
 */
public class TraiterIdentificationReponse {
    public EnumTypeEcran typeEcran;
    public Client leClient;
    public Produit leProduit;
    
    public TraiterIdentificationReponse(){
        typeEcran = EnumTypeEcran.ECRAN_ACCUEIL_PERSO;
    }
}
