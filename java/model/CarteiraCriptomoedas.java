package model;

import javax.persistence.*;

@Entity
public class CarteiraCriptomoedas {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String endereco;
    
    private Double saldo;
    
    public CarteiraCriptomoedas() {}
    
    public CarteiraCriptomoedas(String endereco, Double saldo) {
        this.endereco = endereco;
        this.saldo = saldo;
    }
}