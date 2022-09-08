package br.com.fiap.jpa.main;


import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Apartamento;
import br.com.fiap.entity.ApartamentoId;
import br.com.fiap.entity.TipoApto;


public class Exemplo {


	public static void main(String[] args) {

		//Obter uma fábrica
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		
		EntityManager em = fabrica.createEntityManager();
		
		em.getTransaction().begin();
		
		StringBuilder especificacoes = new StringBuilder();
		especificacoes.append("Apartamento em excelente estado.\n");
		especificacoes.append("Ótima localização.\n");
		especificacoes.append("Em frente ao Shopping e próximo a estação de metrô ");
		especificacoes.append("Todas as revisões feitas.\n");
		especificacoes.append("IPTU pago, aceita financiamento.");
		
		
		Apartamento apto = new Apartamento();
		apto.setCodigo(new ApartamentoId("Bela Vista", 90));
		apto.setPiscina(true);
		apto.setPreco(450000);
		apto.setTipo(TipoApto.PADRAO);
		apto.setDataInauguracao(LocalDate.of(2016, 05, 15));
		apto.setEspecificacoes(null);
		apto.setQuartos(3);
		apto.setVagas(2);
		
		em.persist(apto);
		em.getTransaction().commit();
		
		/*
		em.detach(apto);
		Apartamento apto1 = em.find(Apartamento.class, apto.getCodigo());
		System.out.println("Especificações do apartamento: ");
		System.out.println(apto1.getEspecificacoes());
		*/
		
		System.out.println("pronto!");
		em.close(); 
		fabrica.close();
		
		
		
	}
}
