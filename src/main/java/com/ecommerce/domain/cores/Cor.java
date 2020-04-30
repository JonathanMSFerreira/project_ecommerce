package com.ecommerce.domain.cores;



import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.ecommerce.domain.cortamproduto.CorTamProduto;
import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
public class Cor {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	
	private String cor;

	
	@JsonIgnore
	@OneToMany(mappedBy = "cor", cascade = CascadeType.REFRESH)
    private List<CorTamProduto> corTamProdutos;
	
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public List<CorTamProduto> getCorTamProdutos() {
		return corTamProdutos;
	}


	public void setCorTamProdutos(List<CorTamProduto> corTamProdutos) {
		this.corTamProdutos = corTamProdutos;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
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
		Cor other = (Cor) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}



	
	
	
		
	
}
