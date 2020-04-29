package com.ecommerce.domain.fotos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.ecommerce.domain.cortamproduto.CorTamProduto;
import com.ecommerce.domain.produtos.Produto;
import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
public class FotoProduto {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

  
	private byte[] foto;
	
	

	@JsonIgnore
	@ManyToOne
    private CorTamProduto corTamProduto;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	
	public CorTamProduto getCorTamProduto() {
		return corTamProduto;
	}


	public void setCorTamProduto(CorTamProduto corTamProduto) {
		this.corTamProduto = corTamProduto;
	}


	public byte[] getFoto() {
		return foto;
	}


	public void setFoto(byte[] foto) {
		this.foto = foto;
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
		FotoProduto other = (FotoProduto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	
	
		
	
}
