package com.ecommerce.domain.categorias;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

import org.modelmapper.ModelMapper;

import com.ecommerce.domain.carrinhos.CarrinhoProduto;
import com.ecommerce.domain.categoriaproduto.CategoriaProduto;
import com.ecommerce.domain.cortamproduto.CorTamProduto;
import com.ecommerce.domain.favoritos.Favorito;
import com.ecommerce.domain.fotos.FotoProduto;



public class CategoriaDTO {
   
	
	    private Long id;

	   
		private String titulo;
		
		
		private byte[] foto;
		
		
		
	    private List<CategoriaProduto> categorias;
		
		
		
		


    public static CategoriaDTO create(Categoria categoria) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(categoria, CategoriaDTO.class);
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






	





	public byte[] getFoto() {
		return foto;
	}






	public void setFoto(byte[] foto) {
		this.foto = foto;
	}






	public List<CategoriaProduto> getCategorias() {
		return categorias;
	}






	public void setCategorias(List<CategoriaProduto> categorias) {
		this.categorias = categorias;
	}


    
}
