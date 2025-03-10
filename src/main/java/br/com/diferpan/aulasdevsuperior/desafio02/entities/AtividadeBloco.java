package br.com.diferpan.aulasdevsuperior.desafio02.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_atividade_bloco")
public class AtividadeBloco {
    @EmbeddedId
    private Atividade atividade;
    private Bloco bloco;
}
