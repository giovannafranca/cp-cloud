package br.com.fiap.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Apartamento;


public class BuscandoApto {
	
	public static void main(String[] args) {
	
	EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
	
	EntityManager em = fabrica.createEntityManager();
	
	Apartamento apto = em.find(Apartamento.class, 1L);
	System.out.println("Apto de código " + apto.getCodigo() + " é do condominio " + apto.getCodigo().getCondominio());
	
	
	System.out.println("pronto!");
	em.close();
	fabrica.close();

}
}