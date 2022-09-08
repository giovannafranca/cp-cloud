package br.com.fiap.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Apartamento;


public class AtualizandoApto {

	public static void main(String[] args) {
		
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		
		EntityManager em = fabrica.createEntityManager();

		em.getTransaction().begin();

		Apartamento apto = em.find(Apartamento.class, 1L);
		
		System.out.println("Valor antigo: " + apto.getPreco());
		apto.setPreco(500000);
		System.out.println("Novo valor: " +  apto.getPreco());

		em.getTransaction().commit();

		System.out.println("pronto!");
		em.close();
		fabrica.close();

	}

}

