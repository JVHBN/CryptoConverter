package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import model.ContaBancaria;
import service.ContaBancariaService;

@RestController
@RequestMapping("/contas")
public class ContaBancariaController {
    
    @Autowired
    private ContaBancariaService contaBancariaService;
    
    @GetMapping
    public List<ContaBancaria> findAll() {
        return contaBancariaService.findAll();
    }
    
    @PostMapping
    public ResponseEntity<ContaBancaria> save(@RequestBody ContaBancaria contaBancaria) {
        ContaBancaria novaContaBancaria = contaBancariaService.save(contaBancaria);
        return new ResponseEntity<>(novaContaBancaria, HttpStatus.CREATED);
    }
    
  
}