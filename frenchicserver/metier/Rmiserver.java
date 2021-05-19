/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.UnknownHostException;
import java.rmi.registry.LocateRegistry;

public class Rmiserver {

  public static void main(String[] args) throws java.net.UnknownHostException {
    try {
      LocateRegistry.createRegistry(1099);
      System.setProperty("java.security.policy","C:/Users/levilliard/Desktop/levilliard/Projects/frenchic/policy.policy");

      System.out.println("Mise en place du Security Manager ...");
      if (System.getSecurityManager() == null) {
        System.setSecurityManager(new RMISecurityManager());
      }

      final String address = InetAddress.getLocalHost().getHostAddress();

      //Enregistrement des objects

      ClientImpl client = new ClientImpl();
      String url1 = "rmi://" + address + "/ClientRMI";
      System.out.println("Enregistrement de l'object avec l'url : " + url1);
      Naming.rebind(url1, client);

      ProduitImpl produit = new ProduitImpl();
      String url2 = "rmi://" + address + "/ProduitRMI";
      System.out.println("Enregistrement de l'object avec l'url : " + url2);
      Naming.rebind(url2, produit);

      CommandeImpl commande = new CommandeImpl();
      String url3 = "rmi://" + address + "/CommandeRMI";
      System.out.println("Enregistrement de l'object avec l'url : " + url3);
      Naming.rebind(url3, commande);

      LigneCommandeImpl lCommande = new LigneCommandeImpl();
      String url4 = "rmi://" + address + "/LigneCommandeRMI";
      System.out.println("Enregistrement de l'object avec l'url : " + url4);
      Naming.rebind(url4, lCommande);

      System.out.println("Serveur lancé");
    } catch (RemoteException | MalformedURLException e) {
      e.printStackTrace();
    }
  }
}

