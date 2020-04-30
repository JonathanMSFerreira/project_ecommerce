package com.ecommerce.domain.produtos;


import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;

import com.ecommerce.domain.carrinhos.CarrinhoProduto;
import com.ecommerce.domain.categoriaproduto.CategoriaProduto;
import com.ecommerce.domain.cortamproduto.CorTamProduto;
import com.ecommerce.domain.favoritos.Favorito;
import com.ecommerce.domain.fotos.FotoProduto;
import com.fasterxml.jackson.annotation.JsonIgnore;


@NoArgsConstructor
@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String sku;
    
    private String titulo;
  
    private String descricao;
    
    
   
    private byte[] fotoPrincipal;
    
    private Double precoCompra;
    
     
    private Double precoVenda;
    
    
    private Boolean emPromocao;
    
    private Double precoPromocao;
    
     
    private Integer qtdTotal;
        

    @JsonIgnore
    @OneToMany(mappedBy = "produto", cascade = CascadeType.ALL)
    private List<CorTamProduto> corTamProdutos;
//    
//  
//    
//    @JsonIgnore
//    @OneToMany(mappedBy = "produto", cascade = CascadeType.ALL)
//    private List<Favorito> favoritos;
//    
//    
//    @JsonIgnore
//	@OneToMany(mappedBy = "produto", cascade = CascadeType.ALL)
//    private List<CarrinhoProduto> carrinhos;
//    
    
	
    
 
    @JsonIgnore
	@OneToMany(mappedBy = "produto", cascade = CascadeType.ALL)
    private List<CategoriaProduto> categoriaProdutos;
	
	
		
	
    
    
public List<CategoriaProduto> getCategoriaProdutos() {
		return categoriaProdutos;
	}
	public void setCategoriaProdutos(List<CategoriaProduto> categoriaProdutos) {
		this.categoriaProdutos = categoriaProdutos;
	}
	//	public List<CarrinhoProduto> getCarrinhos() {
//		
//		
//		return carrinhos;
//	}
//	public void setCarrinhos(List<CarrinhoProduto> carrinhos) {
//		this.carrinhos = carrinhos;
//	}
//	public List<Favorito> getFavoritos() {
//		return favoritos;
//	}
//	public void setFavoritos(List<Favorito> favoritos) {
//		this.favoritos = favoritos;
//	}
//
//	
	public List<CorTamProduto> getCorTamProdutos() {
		return corTamProdutos;
	}
	public void setCorTamProdutos(List<CorTamProduto> corTamProdutos) {
		this.corTamProdutos = corTamProdutos;
	}
	

	public Boolean getEmPromocao() {
		return emPromocao;
	}
	public void setEmPromocao(Boolean emPromocao) {
		this.emPromocao = emPromocao;
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

	
	
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
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
		Produto other = (Produto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

    
    



}

