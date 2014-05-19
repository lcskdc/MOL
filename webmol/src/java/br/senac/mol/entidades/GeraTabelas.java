package br.senac.mol.entidades;

import javax.persistence.EntityManager; 
import javax.persistence.EntityManagerFactory; 
import javax.persistence.Persistence; 
/**
 *
 * @author Equipe MOL
 */
public class GeraTabelas { 

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("webmolPU");
        EntityManager em = factory.createEntityManager();
    }
    
}