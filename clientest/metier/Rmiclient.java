/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package rmiclient;
package metier;


import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RMISecurityManager;
import java.rmi.Remote;
import java.rmi.RemoteException;

public class Rmiclient {

  public static void main(String[] args) {
    System.out.println("Lancement du client");

    System.setProperty("java.security.policy","C:/Users/levilliard/Documents/NetBeansProjects/rmiserver/src/policy.policy");

    try {
      Remote r = Naming.lookup("rmi://192.168.1.69/ClientRMI");
      System.out.println(r);
      if (r instanceof Client) {
        String inf = ((Client)r).getNom();
        System.out.println("chaine renvoyee = " + inf);
      }
    } catch (MalformedURLException e) {
      e.printStackTrace();
    } catch (RemoteException e) {
      e.printStackTrace();
    } catch (NotBoundException e) {
      e.printStackTrace();
    }
    System.out.println("Fin du client");
  }
}
