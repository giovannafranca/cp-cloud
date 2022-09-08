package br.com.fiap.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Table(name = "TB_APARTAMENTO")
@SequenceGenerator(name="sequencia", sequenceName="SQ_TB_APTO", allocationSize=1)
public class Apartamento {
	
	@EmbeddedId	
	private ApartamentoId codigo;
	
	//@Id
	//@Column(name="ID_APTO")
	//@GeneratedValue(strategy= GenerationType.SEQUENCE, generator= "sequencia")
	//private Integer id_apto;
	
	@Column(name="VL_QUARTOS", nullable=false, precision=2)
	private Integer quartos;
	
	@Transient
	@Column(name="VL_VAGAS", nullable=false, precision=2)
	private Integer vagas;
	
	@Enumerated(EnumType.STRING)
	@Column(name="DS_TIPO", length=30)
	private TipoApto tipo;
	
	@Column(name="VL_PRECO", nullable=false, precision=9, scale=2)
	private Integer preco;
	
	@Column(name="VL_PISCINA")
	private Boolean piscina;
	
	@Lob
	private String especificacoes;
	
	@Column(name = "DATA_INAUGURACAO", nullable = false)
	private LocalDate dataInauguracao;
	
	
	public Apartamento() {
		
	}

	public Apartamento(ApartamentoId codigo, Integer quartos, Integer vagas, TipoApto tipo, Integer preco,
			Boolean piscina, String especificacoes, LocalDate dataInauguracao) {
		super();
		this.codigo = codigo;
		this.quartos = quartos;
		this.vagas = vagas;
		this.tipo = tipo;
		this.preco = preco;
		this.piscina = piscina;
		this.especificacoes = especificacoes;
		this.dataInauguracao = dataInauguracao;
	}

	public ApartamentoId getCodigo() {
		return codigo;
	}

	public void setCodigo(ApartamentoId codigo) {
		this.codigo = codigo;
	}

	public Integer getQuartos() {
		return quartos;
	}

	public void setQuartos(Integer quartos) {
		this.quartos = quartos;
	}

	public Integer getVagas() {
		return vagas;
	}

	public void setVagas(Integer vagas) {
		this.vagas = vagas;
	}

	public TipoApto getTipo() {
		return tipo;
	}

	public void setTipo(TipoApto tipo) {
		this.tipo = tipo;
	}

	public Integer getPreco() {
		return preco;
	}

	public void setPreco(Integer preco) {
		this.preco = preco;
	}

	public Boolean getPiscina() {
		return piscina;
	}

	public void setPiscina(Boolean piscina) {
		this.piscina = piscina;
	}

	public String getEspecificacoes() {
		return especificacoes;
	}

	public void setEspecificacoes(String especificacoes) {
		this.especificacoes = especificacoes;
	}

	public LocalDate getDataInauguracao() {
		return dataInauguracao;
	}

	public void setDataInauguracao(LocalDate dataInauguracao) {
		this.dataInauguracao = dataInauguracao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((dataInauguracao == null) ? 0 : dataInauguracao.hashCode());
		result = prime * result + ((especificacoes == null) ? 0 : especificacoes.hashCode());
		result = prime * result + ((piscina == null) ? 0 : piscina.hashCode());
		result = prime * result + ((preco == null) ? 0 : preco.hashCode());
		result = prime * result + ((quartos == null) ? 0 : quartos.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		result = prime * result + ((vagas == null) ? 0 : vagas.hashCode());
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
		Apartamento other = (Apartamento) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (dataInauguracao == null) {
			if (other.dataInauguracao != null)
				return false;
		} else if (!dataInauguracao.equals(other.dataInauguracao))
			return false;
		if (especificacoes == null) {
			if (other.especificacoes != null)
				return false;
		} else if (!especificacoes.equals(other.especificacoes))
			return false;
		if (piscina == null) {
			if (other.piscina != null)
				return false;
		} else if (!piscina.equals(other.piscina))
			return false;
		if (preco == null) {
			if (other.preco != null)
				return false;
		} else if (!preco.equals(other.preco))
			return false;
		if (quartos == null) {
			if (other.quartos != null)
				return false;
		} else if (!quartos.equals(other.quartos))
			return false;
		if (tipo != other.tipo)
			return false;
		if (vagas == null) {
			if (other.vagas != null)
				return false;
		} else if (!vagas.equals(other.vagas))
			return false;
		return true;
	}

	

}
