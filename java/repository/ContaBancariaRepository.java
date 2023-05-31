package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import model.ContaBancaria;

public interface ContaBancariaRepository extends JpaRepository<ContaBancaria, Long> {

}
