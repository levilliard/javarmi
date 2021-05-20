/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package metier;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
/**
 *
 * @author levilliard
 */
public interface Commande extends Remote {
    public double getMontant() throws RemoteException;
    public void setMontant(double montant) throws RemoteException;
    public List<LigneCommande> getLesLignesCommande() throws RemoteException;
    public void ajouterCommande(LigneCommande lCommande) throws RemoteException;
}
