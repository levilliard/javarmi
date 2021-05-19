/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlleur;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import metier.Client;
import metier.ClientImpl;
import metier.LigneCommande;
import metier.Produit;

/**
 *
 * @author levilliard
 */
public class Session {
    int MAX_SIZE = 10;

    public Session(){

    }

    public TraiterConnexionReponse traiterConnexion(){
        TraiterConnexionReponse response = new TraiterConnexionReponse();
        return response;
    }


    public TraiterIdentificationReponse traiterIdentification(String pseudo, String motDePasse) throws RemoteException{
        TraiterIdentificationReponse response = new TraiterIdentificationReponse();
        
        Client client = new ClientImpl();
        for(Client cl: client.getClients()){
           if(cl.getPseudo().equals(pseudo) && cl.getMotDePasse().equals(motDePasse)){
              client = cl;
              response.leClient = cl;
              break;
            }
        }
        
        int randomNum = ThreadLocalRandom.current().nextInt(0, MAX_SIZE);
        Produit produit = new ProduitImpl();
        response.leProduit = Commande.produits.get(randomNum);
 
        return response;
    }
    
    public TraiterAjoutPanierReponse traiterAjoutPanier(Produit produit, int qt){
        LigneCommande lCommande = new LigneCommande();
        lCommande.setProduit(produit);
        lCommande.setQuantite(qt);
        lCommande.setMontant(qt * produit.getPrix());
        
        Commande.ajouterCommande(lCommande);
        Commande commande = new Commande();
        commande.setMontant(qt * produit.getPrix());
       
        TraiterAjoutPanierReponse response = new TraiterAjoutPanierReponse();
        response.laCommande = commande;
        return response;
    }
}


