package br.com.diferpan.aulasdevsuperior.desafio02.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_participante_atividade")
public class ParticipanteAtividade {
    @EmbeddedId
    private ParticipanteAtividadePK id;

    @ManyToOne
    @MapsId("participanteId")
    @JoinColumn(name = "participante_id")
    private Participante participante;

    @ManyToOne
    @MapsId("atividadeId")
    @JoinColumn(name = "atividade_id")
    private Atividade atividade;

    public ParticipanteAtividadePK getId() { return id; }
    public void setId(ParticipanteAtividadePK id) { this.id = id; }
    public Participante getParticipante() { return participante; }
    public void setParticipante(Participante participante) { this.participante = participante; }
    public Atividade getAtividade() { return atividade; }
    public void setAtividade(Atividade atividade) { this.atividade = atividade; }

    public ParticipanteAtividade() {}

    public ParticipanteAtividade(ParticipanteAtividadePK id, Participante participante, Atividade atividade) {
        this.id = id;
        this.participante = participante;
        this.atividade = atividade;
    }
}