package com.ecommerce.domain.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository rep;

    public List<User> getClientes() {
    	
        
        return rep.findAll();
    }

//    public UserDTO getClientesById(Long id) {
//        Optional<User> cliente = rep.findById(id);
//        return cliente .map(UserDTO::create).orElseThrow(() -> new ObjectNotFoundException("Cliente não encontrado"));
//    }
//
//    public List<ProdutoDTO> getCarrosByTipo(String tipo) {
//        return rep.findByTipo(tipo).stream().map(ProdutoDTO::create).collect(Collectors.toList());
//    }
//
//    public CorDTO insert(Cor cor) {
//        Assert.isNull(cor.getId(),"Não foi possível inserir o registro");
//
//        return CorDTO.create(rep.save(cor));
//    }
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
