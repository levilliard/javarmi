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
public interface Produit  extends Remote{
    public int getQuantite()throws RemoteException;
    public void setQuantite(int quantite) throws RemoteException;
    public double getPrix()throws RemoteException;
    public void setPrix(double prix) throws RemoteException;
    public String getNom() throws RemoteException;
    public void setNom(String nom) throws RemoteException;
    public List<Produit> getProduits()throws RemoteException;
}
