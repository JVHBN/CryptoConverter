package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import model.CarteiraCriptomoedas;
import service.CarteiraCriptomoedasService;

@RestController
@RequestMapping("/carteiras")
public class CarteiraCriptomoedasController {
    
    @Autowired
    private CarteiraCriptomoedasService carteiraCriptomoedasService;
    
    @GetMapping
    public List<CarteiraCriptomoedas> findAll() {
        return carteiraCriptomoedasService.findAll();
    }
    
    @PostMapping
    public ResponseEntity<CarteiraCriptomoedas> save(@RequestBody CarteiraCriptomoedas carteiraCriptomoedas) {
        CarteiraCriptomoedas novaCarteiraCriptomoedas = carteiraCriptomoedasService.save(carteiraCriptomoedas);
        return new ResponseEntity<>(novaCarteiraCriptomoedas, HttpStatus.CREATED);
    }
    
 
}




@GetMapping("/{id}")
public ResponseEntity<CarteiraCriptomoedas> findById(@PathVariable Long id) {
    CarteiraCriptomoedas carteiraCriptomoedas = carteiraCriptomoedasService.findById(id);
    return ResponseEntity.ok(carteiraCriptomoedas);
}

@PutMapping("/{id}")
public ResponseEntity<CarteiraCriptomoedas> update(@PathVariable Long id, @RequestBody CarteiraCriptomoedas carteiraCriptomoedas) {
    carteiraCriptomoedas.setId(id);
    CarteiraCriptomoedas carteiraAtualizada = carteiraCriptomoedasService.update(carteiraCriptomoedas);
    return ResponseEntity.ok(carteiraAtualizada);
}

@DeleteMapping("/{id}")
public ResponseEntity<Void> delete(@PathVariable Long id) {
    carteiraCriptomoedasService.delete(id);
    return ResponseEntity.noContent().build();
}
}

