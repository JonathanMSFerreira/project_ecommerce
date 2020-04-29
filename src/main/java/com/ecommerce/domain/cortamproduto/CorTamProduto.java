package com.ecommerce.domain.cortamproduto;



import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.ecommerce.domain.cores.Cor;
import com.ecommerce.domain.fotos.FotoProduto;
import com.ecommerce.domain.produtos.Produto;
import com.ecommerce.domain.tamanhos.Tamanho;
import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
public class CorTamProduto {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

  

	@ManyToOne
    private Cor cor;
	
	
	
	
	@ManyToOne
    private Tamanho tamanho;
	
	
	
	@JsonIgnore
	@ManyToOne
    private Produto produto;
	
	
	
	private Integer qtdEstoque;
	
	

	
    @OneToMany(mappedBy = "corTamProduto", cascade = CascadeType.ALL)
    private List<FotoProduto> fotos;
	
	
	
	

	public List<FotoProduto> getFotos() {
		return fotos;
	}


	public void setFotos(List<FotoProduto> fotos) {
		this.fotos = fotos;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}

	
	

	public Tamanho getTamanho() {
		return tamanho;
	}


	public void setTamanho(Tamanho tamanho) {
		this.tamanho = tamanho;
	}


	public Integer getQtdEstoque() {
		return qtdEstoque;
	}


	public void setQtdEstoque(Integer qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}


	public Produto getProduto() {
		return produto;
	}


	public void setProduto(Produto produto) {
		this.produto = produto;
	}


	public Cor getCor() {
		return cor;
	}


	public void setCor(Cor cor) {
		this.cor = cor;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		CorTamProduto other = (CorTamProduto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}



	
	
	
		
	
}
