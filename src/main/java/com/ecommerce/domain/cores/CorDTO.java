package com.ecommerce.domain.cores;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

import org.modelmapper.ModelMapper;

import com.ecommerce.domain.carrinhos.CarrinhoProduto;
import com.ecommerce.domain.categoriaproduto.CategoriaProduto;
import com.ecommerce.domain.cortamproduto.CorTamProduto;
import com.ecommerce.domain.favoritos.Favorito;
import com.ecommerce.domain.fotos.FotoProduto;


public class CorDTO {
   
	
	private Long id;	
	
	private String cor;
	

    private List<CorTamProduto> produtos;
	
		

    public static CorDTO create(Cor cor) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(cor, CorDTO.class);
    }

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public List<CorTamProduto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<CorTamProduto> produtos) {
		this.produtos = produtos;
	}

	
	
	
    
}
