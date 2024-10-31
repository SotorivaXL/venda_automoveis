package br.edu.famper.venda_automoveis.repository;
import br.edu.famper.venda_automoveis.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {}


