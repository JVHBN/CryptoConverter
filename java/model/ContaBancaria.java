package model;

import javax.persistence.*;

@Entity
public class ContaBancaria {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String numero;
    
    private Double saldo;
    
    public ContaBancaria() {}
    
    public ContaBancaria(String numero, Double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }
}