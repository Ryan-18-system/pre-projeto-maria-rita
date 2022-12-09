package br.edu.ifpb.ecommerce.ecommerce.model.repository;

import br.edu.ifpb.ecommerce.ecommerce.model.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PessoaIF extends JpaRepository<Pessoa,Long> {
    List<Pessoa> findAll();

}
