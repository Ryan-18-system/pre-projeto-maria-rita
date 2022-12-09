package br.edu.ifpb.ecommerce.ecommerce.model.service;

import br.edu.ifpb.ecommerce.ecommerce.model.entity.Pessoa;
import br.edu.ifpb.ecommerce.ecommerce.model.repository.PessoaIF;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {
    @Autowired
    private PessoaIF pessoaRepository;

    public List<Pessoa> getAllPessoa() {
        return pessoaRepository.findAll();
    }
}
