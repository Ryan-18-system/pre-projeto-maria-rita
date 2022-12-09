package br.edu.ifpb.ecommerce.ecommerce.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_cliente")
@Data
@EqualsAndHashCode
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String email;

    private String senha;

    private String telefone;

    private String cpf;

    private LocalDate dataDeNascimento;

    private String imagem;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "cliente",cascade = CascadeType.REMOVE,orphanRemoval=true)
    private List<Produto> produtos = new ArrayList<>();
}
