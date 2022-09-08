package br.com.fiap.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable // classe embutida
public class ApartamentoId implements Serializable {
	private static final long serialVersionUID = 1L;

	private String condominio;
	private Integer metros;

	public ApartamentoId() {
	}


	public ApartamentoId(String condominio, Integer metros) {
		super();
		this.condominio = condominio;
		this.metros = metros;
	}



	public String getCondominio() {
		return condominio;
	}

	public void setCondominio(String condominio) {
		this.condominio = condominio;
	}

	public Integer getMetros() {
		return metros;
	}

	public void setMetros(Integer metros) {
		this.metros = metros;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((condominio == null) ? 0 : condominio.hashCode());
		result = prime * result + ((metros == null) ? 0 : metros.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ApartamentoId other = (ApartamentoId) obj;
		if (condominio == null) {
			if (other.condominio != null)
				return false;
		} else if (!condominio.equals(other.condominio))
			return false;
		if (metros == null) {
			if (other.metros != null)
				return false;
		} else if (!metros.equals(other.metros))
			return false;
		return true;
	}

	
}

