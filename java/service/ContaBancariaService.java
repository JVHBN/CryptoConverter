package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import model.ContaBancaria;
import repository.ContaBancariaRepository;

@Service
public class ContaBancariaService {
    
    @Autowired
    private ContaBancariaRepository contaBancariaRepository;
    
    public List<ContaBancaria> findAll() {
        return contaBancariaRepository.findAll();
    }
    
    public ContaBancaria save(ContaBancaria contaBancaria) {
        return contaBancariaRepository.save(contaBancaria);
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