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
public class ClientImpl  extends UnicastRemoteObject implements Client{
    private String pseudo;
    private String motDePasse;
    private String nom;
    private String prenom;
    private static final long serialVersionUID = 2674880711467464649L;

    public ClientImpl() throws RemoteException {
        this.nom = "Not set yet !";
    }
    
    public ClientImpl(String nom, String prenom, String pseudo, String motDePasse) throws RemoteException {
        this.nom = nom;
        this.prenom = prenom;
        this.pseudo = pseudo;
        this.motDePasse = motDePasse;
    }
    
    @Override
    public String getNom() throws RemoteException {
        return nom;
    }

    @Override
    public void setNom(String nom) throws RemoteException {
        this.nom = nom;
    }

    @Override
    public String getPrenom() throws RemoteException {
        return prenom;
    }

    @Override
    public void setPrenom(String prenom) throws RemoteException {
        this.prenom = prenom;
    }

    @Override
    public String getPseudo() throws RemoteException {
        return pseudo;
    }

    @Override
    public void setPseudo(String pseudo) throws RemoteException {
        this.pseudo = pseudo;
    }

    @Override
    public String getMotDePasse() throws RemoteException {
        return motDePasse;
    }

    @Override
    public void setMotDePasse(String motDePasse) throws RemoteException {
        this.motDePasse = motDePasse;
    }

    @Override
    public List<Client> getClients() throws RemoteException {
        List<Client> clients = new ArrayList<Client>();
        Client c0 = new ClientImpl("Toto", "Pierre", "toto", "pass");
        Client c1 = new ClientImpl("Lebrun", "Jacques", "lebrun", "Password");
        Client c2 = new ClientImpl("Wilson", "Maggi", "maggi", "maggi01");
        clients.add(c0);
        clients.add(c1);
        clients.add(c2);
        return clients;
    }

}
