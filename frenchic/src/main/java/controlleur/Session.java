/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlleur;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import metier.Client;
import metier.ClientImpl;
import metier.Commande;
import metier.LigneCommande;
import metier.Produit;

/**
 *
 * @author levilliard
 */
public class Session {
    int MAX_SIZE = 10;
    Client client;
    Produit produit;
    LigneCommande ligneCommande;
    Commande commande;
    
    public Session(){
        System.setProperty("java.security.policy","C:/Users/levilliard/Documents/NetBeansProjects/rmiserver/src/policy.policy");
        try {
          Remote rm1 = Naming.lookup("rmi://192.168.1.69/ClientRMI");
          if (rm1 instanceof Client) {
            client = ((Client)rm1);
          }
          
          Remote rm2 = Naming.lookup("rmi://192.168.1.69/ProduitRMI");
          if (rm2 instanceof Produit) {
              produit = ((Produit)rm2);
          }
          
          Remote rm3 = Naming.lookup("rmi://192.168.1.69/CommandeRMI");
          if (rm3 instanceof Commande) {
            commande = ((Commande)rm3);
          }
          Remote rm4 = Naming.lookup("rmi://192.168.1.69/LigneCommandeRMI");
          if (rm4 instanceof LigneCommande) {
            ligneCommande = ((LigneCommande)rm4);
          }
        } catch (MalformedURLException e) {
          e.printStackTrace();
        } catch (RemoteException e) {
          e.printStackTrace();
        } catch (NotBoundException e) {
          e.printStackTrace();
        }
    }

    public TraiterConnexionReponse traiterConnexion(){
        TraiterConnexionReponse response = new TraiterConnexionReponse();
        return response;
    }


    public TraiterIdentificationReponse traiterIdentification(String pseudo, String motDePasse) throws RemoteException{
        TraiterIdentificationReponse response = new TraiterIdentificationReponse();
        
        for(Client cl: client.getClients()){
           if(cl.getPseudo().equals(pseudo) && cl.getMotDePasse().equals(motDePasse)){
              client = cl;
              response.leClient = cl;
              break;
            }
        }
        
        int randomNum = ThreadLocalRandom.current().nextInt(0, MAX_SIZE);
        response.leProduit = produit.getProduits().get(randomNum);
        return response;
    }
    
    public TraiterAjoutPanierReponse traiterAjoutPanier(Produit produit, int qt) throws RemoteException{
        ligneCommande.setProduit(produit);
        ligneCommande.setQuantite(qt);
        ligneCommande.setMontant(qt * produit.getPrix());
        
        commande.ajouterCommande(ligneCommande);
        commande.setMontant(qt * produit.getPrix());
       
        TraiterAjoutPanierReponse response = new TraiterAjoutPanierReponse();
        response.laCommande = commande;
        return response;
    }
}


