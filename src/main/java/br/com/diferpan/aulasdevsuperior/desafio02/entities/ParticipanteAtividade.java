package br.com.diferpan.aulasdevsuperior.desafio02.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_participante_atividade")
public class ParticipanteAtividade {
    @EmbeddedId
    private Participante participante;
    private Atividade atividade;
}
