package com.ecommerce.domain.categoriaproduto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.ecommerce.utils.exception.ObjectNotFoundException;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CategoriaProdutoService {

    @Autowired
    private CategoriaProdutoRepository rep;

    public List<CategoriaProduto> getCategoriaProdutos() {
        List<CategoriaProduto> list = rep.findAll();
        return list;
    }

    public CategoriaProduto getCategoriaProdutoById(Long id) {
        Optional<CategoriaProduto> carrinho = rep.findById(id);
        return carrinho.orElseThrow(() -> new ObjectNotFoundException("Carrinho não encontrada"));
    }
//
//    public List<ProdutoDTO> getCarrosByTipo(String tipo) {
//        return rep.findByTipo(tipo).stream().map(ProdutoDTO::create).collect(Collectors.toList());
//    }

    public CategoriaProduto insert(CategoriaProduto fotos) {
        Assert.isNull(fotos.getId(),"Não foi possível inserir o registro");

        return rep.save(fotos);
    }
//
//    public ProdutoDTO update(Produto produto, Long id) {
//        Assert.notNull(id,"Não foi possível atualizar o registro");
//
//        // Busca o carro no banco de dados
//        Optional<Produto> optional = rep.findById(id);
//        if(optional.isPresent()) {
//            Produto db = optional.get();
//            // Copiar as propriedades
//            db.setNome(produto.getNome());
//            db.setTipo(produto.getTipo());
//            System.out.println("Carro id " + db.getId());
//
//            // Atualiza o carro
//            rep.save(db);
//
//            return ProdutoDTO.create(db);
//        } else {
//            return null;
//            //throw new RuntimeException("Não foi possível atualizar o registro");
//        }
//    }

    public void delete(Long id) {
        rep.deleteById(id);
    }
}
