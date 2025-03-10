package br.com.diferpan.aulasdevsuperior.desafio02.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_atividade_categoria")
public class AtividadeCategoria {
    @EmbeddedId
    private Atividade atividade;
    private Categoria categoria;
}
