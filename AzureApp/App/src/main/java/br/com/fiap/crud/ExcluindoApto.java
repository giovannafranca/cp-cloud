package br.com.fiap.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Apartamento;


public class ExcluindoApto {

	public static void main(String[] args) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		
		EntityManager em = fabrica.createEntityManager();

		em.getTransaction().begin();

		Apartamento apto = em.find(Apartamento.class, 1L);
		em.remove(apto);
		
		em.getTransaction().commit();

		System.out.println("pronto!");
		em.close(); // fechando...
		fabrica.close();


	}

}
