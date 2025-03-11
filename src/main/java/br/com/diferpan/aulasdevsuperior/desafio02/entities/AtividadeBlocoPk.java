package br.com.diferpan.aulasdevsuperior.desafio02.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class AtividadeBlocoPk implements Serializable {
    @Column(name = "atividade_id")
    private Long atividadeId;
    @Column(name = "bloco_id")
    private Long blocoId;

    public Long getAtividadeId() { return atividadeId; }
    public void setAtividadeId(Long atividadeId) { this.atividadeId = atividadeId; }
    public Long getBlocoId() { return blocoId; }
    public void setBlocoId(Long blocoId) { this.blocoId = blocoId; }

    public AtividadeBlocoPk() {}

    public AtividadeBlocoPk(Long atividadeId, Long blocoId) {
        this.atividadeId = atividadeId;
        this.blocoId = blocoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AtividadeBlocoPk that = (AtividadeBlocoPk) o;
        return Objects.equals(atividadeId, that.atividadeId) && Objects.equals(blocoId, that.blocoId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(atividadeId, blocoId);
    }
}