/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package metier;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author levilliard
 */
public class LigneCommandeImpl  extends UnicastRemoteObject implements LigneCommande {
    private Produit produit;
    private double montant;
    private int quantite;
    private static final long serialVersionUID = 2674880711467464647L;
    
    public LigneCommandeImpl() throws RemoteException{

    }

    @Override
    public int getQuantite() throws RemoteException {
        return quantite;
    }

    @Override
    public void setQuantite(int quantite) throws RemoteException {
        this.quantite = quantite;
    }

    @Override
    public double getMontant() throws RemoteException {
        return montant;
    }

    @Override
    public void setMontant(double montant) throws RemoteException {
        this.montant = quantite;
    }

    @Override
    public Produit getProduit() throws RemoteException {
        return produit;
    }

    @Override
    public void setProduit(Produit produit) throws RemoteException {
        this.produit = produit;
    }

}
