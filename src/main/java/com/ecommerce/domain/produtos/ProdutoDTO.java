package com.ecommerce.domain.produtos;


import java.util.List;

import org.modelmapper.ModelMapper;

import com.ecommerce.domain.carrinhos.CarrinhoProduto;
import com.ecommerce.domain.categoriaproduto.CategoriaProduto;
import com.ecommerce.domain.cortamproduto.CorTamProduto;
import com.ecommerce.domain.favoritos.Favorito;
import com.ecommerce.domain.fotos.FotoProduto;



public class ProdutoDTO {
   
	
	 private Long id;

	    private String titulo;
	  
	    private String descricao;
	    
	    private byte[] fotoPrincipal;
	    
	   
	    private Boolean emPromocao;
	    
	    private Double precoCompra;
	    
	    private Double precoVenda;
	    
	    private Double precoPromocao;
	    
	     
	    private Integer qtdTotal;
	  
	  
	  
	    private List<CorTamProduto> corTamProdutos;

	    
	 
	    private List<Favorito> favoritos;
	    
	    
	    private List<CarrinhoProduto> carrinhos;
	    
	    
	    private List<CategoriaProduto> categorias;
		


    public static ProdutoDTO create(Produto produto) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(produto, ProdutoDTO.class);
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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


	

	public byte[] getFotoPrincipal() {
		return fotoPrincipal;
	}

	public void setFotoPrincipal(byte[] fotoPrincipal) {
		this.fotoPrincipal = fotoPrincipal;
	}


	public Boolean getEmPromocao() {
		return emPromocao;
	}

	public void setEmPromocao(Boolean emPromocao) {
		this.emPromocao = emPromocao;
	}

	


	

	public Double getPrecoCompra() {
		return precoCompra;
	}

	public void setPrecoCompra(Double precoCompra) {
		this.precoCompra = precoCompra;
	}

	public Double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(Double precoVenda) {
		this.precoVenda = precoVenda;
	}

	public Double getPrecoPromocao() {
		return precoPromocao;
	}

	public void setPrecoPromocao(Double precoPromocao) {
		this.precoPromocao = precoPromocao;
	}

	public Integer getQtdTotal() {
		return qtdTotal;
	}

	public void setQtdTotal(Integer qtdTotal) {
		this.qtdTotal = qtdTotal;
	}

	public List<CorTamProduto> getCorTamProdutos() {
		return corTamProdutos;
	}

	public void setCorTamProdutos(List<CorTamProduto> corTamProdutos) {
		this.corTamProdutos = corTamProdutos;
	}

	public List<Favorito> getFavoritos() {
		return favoritos;
	}

	public void setFavoritos(List<Favorito> favoritos) {
		this.favoritos = favoritos;
	}

	public List<CarrinhoProduto> getCarrinhos() {
		return carrinhos;
	}

	public void setCarrinhos(List<CarrinhoProduto> carrinhos) {
		this.carrinhos = carrinhos;
	}

	public List<CategoriaProduto> getCategorias() {
		return categorias;
	}

	public void setCategorias(List<CategoriaProduto> categorias) {
		this.categorias = categorias;
	}


	
    
    
    
}
