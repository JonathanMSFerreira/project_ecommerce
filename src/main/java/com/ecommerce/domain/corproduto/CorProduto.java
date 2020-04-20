package com.ecommerce.domain.corproduto;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.ecommerce.domain.cores.Cor;
import com.ecommerce.domain.produtos.Produto;



@Entity
public class CorProduto {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

  
	@ManyToOne
    private Cor cor;
	
	
	
	@ManyToOne
    private Produto produto;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
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
		CorProduto other = (CorProduto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}



	
	
	
		
	
}
