/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package metier;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author levilliard
 */
public class CommandeImpl  extends UnicastRemoteObject implements Commande{
    List<LigneCommande> ligneCommandes;
    private double montant;
    private static final long serialVersionUID = 2674880711467464648L;

    public CommandeImpl() throws RemoteException {
        this.ligneCommandes = new ArrayList<>();
    }

    @Override
    public double getMontant() {
        return montant;
    }

    @Override
    public void setMontant(double montant) throws RemoteException {
        this.montant = montant;
    }

    @Override
    public List<LigneCommande> getLesLignesCommande() throws RemoteException {
        return ligneCommandes;
    }

    @Override
    public void ajouterCommande(LigneCommande lCommande) throws RemoteException {
        this.ligneCommandes.add(lCommande);
    }

}
