package br.com.diferpan.aulasdevsuperior.desafio02.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ParticipanteAtividadePK implements Serializable {
    @Column(name = "participante_id")
    private Long participanteId;
    @Column(name = "atividade_id")
    private Long atividadeId;

    public Long getParticipanteId() { return participanteId; }
    public void setParticipanteId(Long participanteId) { this.participanteId = participanteId; }
    public Long getAtividadeId() { return atividadeId; }
    public void setAtividadeId(Long atividadeId) { this.atividadeId = atividadeId; }

    public ParticipanteAtividadePK() {}

    public ParticipanteAtividadePK(Long participanteId, Long atividadeId) {
        this.participanteId = participanteId;
        this.atividadeId = atividadeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParticipanteAtividadePK that = (ParticipanteAtividadePK) o;
        return Objects.equals(participanteId, that.participanteId) && Objects.equals(atividadeId, that.atividadeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(participanteId, atividadeId);
    }
}