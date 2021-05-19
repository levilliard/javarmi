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
public interface Client extends Remote {
    public String getNom() throws RemoteException;
    public void setNom(String nom) throws RemoteException;
    public String getPrenom() throws RemoteException;
    public void setPrenom(String prenom) throws RemoteException;
    public String getPseudo() throws RemoteException;
    public void setPseudo(String pseudo) throws RemoteException;
    public String getMotDePasse() throws RemoteException;
    public void setMotDePasse(String motDePasse) throws RemoteException;
    public List<Client> getClients() throws RemoteException;
}
