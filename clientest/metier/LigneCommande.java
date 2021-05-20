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
public interface LigneCommande  extends Remote{
    public int getQuantite()throws RemoteException;
    public void setQuantite(int quantite)throws RemoteException;
    public double getMontant()throws RemoteException;
    public void setMontant(double montant)throws RemoteException;
    public Produit getProduit()throws RemoteException;
    public void setProduit(Produit produit)throws RemoteException;
}
