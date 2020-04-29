package com.ecommerce.domain.favoritos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/favoritos")
public class FavoritoController {
    
	
	@Autowired
    private FavoritoService service;

    @GetMapping()
    public ResponseEntity get() {
     
    	List<Favorito> cores = service.getFavoritos();
        return ResponseEntity.ok(cores);
    
    }

    @GetMapping("/{id}")
    public ResponseEntity get(@PathVariable("id") Long id) {
    
    	Favorito favorito = service.getFavoritoById(id);
        return ResponseEntity.ok(favorito);
    }

//    @GetMapping("/tipo/{tipo}")
//    public ResponseEntity getCarrosByTipo(@PathVariable("tipo") String tipo) {
//        List<ProdutoDTO> carros = service.getCarrosByTipo(tipo);
//        return carros.isEmpty() ?
//                ResponseEntity.noContent().build() :
//                ResponseEntity.ok(carros);
//    }

    @PostMapping
    @Secured({ "ROLE_ADMIN" })
    public ResponseEntity post(@RequestBody Favorito favorito) {

    	Favorito c = service.insert(favorito);

        URI location = getUri(c.getId());
        return ResponseEntity.created(location).build();
    }

    private URI getUri(Long id) {
        return ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(id).toUri();
    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity put(@PathVariable("id") Long id, @RequestBody Produto produto) {
//
//        produto.setId(id);
//
//        ProdutoDTO c = service.update(produto, id);
//
//        return c != null ?
//                ResponseEntity.ok(c) :
//                ResponseEntity.notFound().build();
//    }

    
    
 
    @Secured({ "ROLE_ADMIN" })
    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable("id") Long id) {
        service.delete(id);
        return ResponseEntity.ok().build();
    }
}
