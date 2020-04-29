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
	    
	    private Double menorPreco;
	    
	    private Boolean emPromocao;
	    
	    private Double maiorPreco;
	    
	    private Integer qtdEstoque;
	  
	    private List<FotoProduto> fotos;
		
	  
	  
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
	
	

	public Integer getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(Integer qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
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

	public Double getMenorPreco() {
		return menorPreco;
	}

	public void setMenorPreco(Double menorPreco) {
		this.menorPreco = menorPreco;
	}

	public Boolean getEmPromocao() {
		return emPromocao;
	}

	public void setEmPromocao(Boolean emPromocao) {
		this.emPromocao = emPromocao;
	}

	public Double getMaiorPreco() {
		return maiorPreco;
	}

	public void setMaiorPreco(Double maiorPreco) {
		this.maiorPreco = maiorPreco;
	}

	public List<FotoProduto> getFotos() {
		return fotos;
	}

	public void setFotos(List<FotoProduto> fotos) {
		this.fotos = fotos;
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
