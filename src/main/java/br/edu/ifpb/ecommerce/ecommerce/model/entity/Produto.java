package br.edu.ifpb.ecommerce.ecommerce.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "tb_produto")
@Data
@EqualsAndHashCode
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String titulo;
    private double valor;
    private String foto;
    private String infomacao;
    @ManyToOne(fetch = FetchType.EAGER,cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    private Pessoa cliente;

}
