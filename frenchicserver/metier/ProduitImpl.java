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
public class ProduitImpl  extends UnicastRemoteObject implements Produit{
    private int quantite;
    private double prix;
    private String nom;
    List<Produit> produits;
    private static final long serialVersionUID = 2674880711467464646L;


    public ProduitImpl() throws RemoteException {
       this.produits = new ArrayList<Produit>();
    }
    
    public ProduitImpl(int quantite, double prix, String nom) throws RemoteException {
        this.quantite = quantite;
        this.prix = prix;
        this.nom = nom;
        this.produits = new ArrayList<Produit>();
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
    public double getPrix() throws RemoteException {
        return prix;
    }

    @Override
    public void setPrix(double prix) throws RemoteException {
        this.prix = prix;
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
    public List<Produit> getProduits() throws RemoteException {
        Produit p0 = new ProduitImpl(34, 43.99, "Kanson Fe");
        Produit p1 = new ProduitImpl(200, 60.99, "Chemise Lafaillette");
        Produit p2 = new ProduitImpl(20, 23.99, "Chaussure KV");
        Produit p3 = new ProduitImpl(30, 45.99, "Chemise Fe");
        Produit p4 = new ProduitImpl(400, 43.99, "Tenis Fe");
        Produit p5 = new ProduitImpl(79, 80.99, "Robe Rose");
        Produit p6 = new ProduitImpl(230, 34.99, "Jupe FK");
        Produit p7 = new ProduitImpl(100, 110.99, "Pantalon FB");
        Produit p8 = new ProduitImpl(103, 55.99, "Pantalon D&G");
        Produit p9 = new ProduitImpl(145, 90.99, "Chemise D&G");
        produits.add(p0);
        produits.add(p1);
        produits.add(p2);
        produits.add(p3);
        produits.add(p4);
        produits.add(p5);
        produits.add(p6);
        produits.add(p7);
        produits.add(p8);        
        produits.add(p9);
        
        return produits;
    }

}
