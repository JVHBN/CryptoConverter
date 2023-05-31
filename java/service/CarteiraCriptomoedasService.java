package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import model.CarteiraCriptomoedas;
import repository.CarteiraCriptomoedasRepository;

@Service
public class CarteiraCriptomoedasService {
    
    @Autowired
    private CarteiraCriptomoedasRepository carteiraCriptomoedasRepository;
    
    public List <CarteiraCriptomoedas> getAllCarteiras() {
    	return carteiraCriptomoedasRepository.findAll();
    }
    
    public CarteiraCriptomoedas getCarteiraById(Long id) {
        return carteiraCriptomoedasRepository.findById(id).orElse(null);
    }

    public CarteiraCriptomoedas saveCarteira(CarteiraCriptomoedas carteira) {
        return carteiraCriptomoedasRepository.save(carteira);
    }

    public void deleteCarteiraById(Long id) {
        carteiraCriptomoedasRepository.deleteById(id);
    }
}