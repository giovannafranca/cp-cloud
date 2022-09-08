package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_ENDERECO")
@SequenceGenerator(name="sequencia", sequenceName="SQ_TB_ENDERECO", allocationSize=1)
public class Endereco {
	
	@Id
	@Column(name="ID_ENDERECO")
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator= "sequencia")
	private Integer id_endereco;
	
	@Column(name="NM_RUA", nullable=false, length=100)
	private String rua;
	
	@Column(name="NM_BAIRRO", nullable=false, length=70)
	private String bairro;
	
	@Column(name="NR_ENDERECO", nullable=false, precision=6)
	private Integer numero;
	
	@Column(name="NM_CIDADE", nullable=false, length=100)
	private String cidade;
	
	@Column(name="NM_ESTADO", nullable=false, length=100)
	private String estado;
	
	@Column(name="NR_CEP", nullable=false, precision=8)
	private Integer cep;

	
	public Endereco() {
		
	}
	
	public Endereco(Integer id_endereco, String rua, String bairro, Integer numero, String cidade, String estado,
			Integer cep) {
		super();
		this.id_endereco = id_endereco;
		this.rua = rua;
		this.bairro = bairro;
		this.numero = numero;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
	}

	public Integer getId_endereco() {
		return id_endereco;
	}

	public void setId_endereco(Integer id_endereco) {
		this.id_endereco = id_endereco;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Integer getCep() {
		return cep;
	}

	public void setCep(Integer cep) {
		this.cep = cep;
	}

	
}
