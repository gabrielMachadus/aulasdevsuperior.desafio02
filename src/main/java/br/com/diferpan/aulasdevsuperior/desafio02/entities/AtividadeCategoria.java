package br.com.diferpan.aulasdevsuperior.desafio02.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_atividade_categoria")
public class AtividadeCategoria {
    @EmbeddedId
    private AtividadeCategoriaPK id = new AtividadeCategoriaPK();

    @ManyToOne
    @MapsId("atividadeId")
    @JoinColumn(name = "atividade_id")
    private Atividade atividade;

    @ManyToOne
    @MapsId("categoriaId")
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;
}
