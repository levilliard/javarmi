/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlleur;

import controlleur.EnumTypeEcran;

/**
 *
 * @author eliseevilliard
 */
public class TraiterConnexionReponse {
    public EnumTypeEcran typeEcran;
    
    public TraiterConnexionReponse(){
        typeEcran = EnumTypeEcran.ECRAN_ACCUEIL;
    }
}
