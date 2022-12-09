package br.edu.ifpb.ecommerce.ecommerce.controller;

import br.edu.ifpb.ecommerce.ecommerce.model.entity.Pessoa;
import br.edu.ifpb.ecommerce.ecommerce.model.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseEntity<List<Pessoa>>  getPessoas(){
        List<Pessoa> pessoas = pessoaService.getAllPessoa();
        if(pessoas.isEmpty()){
            return  new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(pessoas,HttpStatus.OK);
    }
}
