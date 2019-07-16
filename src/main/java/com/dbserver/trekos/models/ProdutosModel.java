package com.dbserver.trekos.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="produtos")
public class ProdutosModel implements Serializable {
	private static final long serialVersionUID = 1L;
		
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_produto", nullable=false)
	private long idProduto;
	
	@Column(name="txt_titulo", nullable=false)
	private String titulo;

	@Column(name="txt_descricao", columnDefinition="TEXT NULL")
	private String descricao;
	
	@Column(name="txt_categoria", nullable=false)
	private String categoria;
	
	@Column(name="nro_preco", columnDefinition="DECIMAL(10,2) DEFAULT 0.00")
	private String preco;
	
	@Column(name="txt_imagem_principal", nullable=false)
	private String imagem;
	
	@Column(name="txt_contato", nullable=false)
	private String contato;
	
	@Column(name="bool_vendido", nullable=false)
	private boolean vendido;
	
	@Column(name="id_anunciante", nullable=false)
	private String anunciante;

	public long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(long idProduto) {
		this.idProduto = idProduto;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public boolean isVendido() {
		return vendido;
	}

	public void setVendido(boolean vendido) {
		this.vendido = vendido;
	}

	public String getAnunciante() {
		return anunciante;
	}

	public void setAnunciante(String anunciante) {
		this.anunciante = anunciante;
	}

}