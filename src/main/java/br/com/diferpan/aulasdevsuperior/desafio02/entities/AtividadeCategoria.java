package br.com.diferpan.aulasdevsuperior.desafio02.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_atividade_categoria")
public class AtividadeCategoria {
    @EmbeddedId
    private AtividadeCategoriaPK id;

    @ManyToOne
    @MapsId("atividadeId")
    @JoinColumn(name = "atividade_id")
    private Atividade atividade;

    @ManyToOne
    @MapsId("categoriaId")
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    public AtividadeCategoriaPK getId() { return id; }
    public void setId(AtividadeCategoriaPK id) { this.id = id; }
    public Atividade getAtividade() { return atividade; }
    public void setAtividade(Atividade atividade) { this.atividade = atividade; }
    public Categoria getCategoria() { return categoria; }
    public void setCategoria(Categoria categoria) { this.categoria = categoria; }

    public AtividadeCategoria() {}

    public AtividadeCategoria(AtividadeCategoriaPK id, Atividade atividade, Categoria categoria) {
        this.id = id;
        this.atividade = atividade;
        this.categoria = categoria;
    }
}