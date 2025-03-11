package br.com.diferpan.aulasdevsuperior.desafio02.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class AtividadeCategoriaPK implements Serializable {
    @Column(name = "atividade_id")
    private Long atividadeId;
    @Column(name = "categoria_id")
    private Long categoriaId;

    public Long getAtividadeId() { return atividadeId; }
    public void setAtividadeId(Long atividadeId) { this.atividadeId = atividadeId; }
    public Long getCategoriaId() { return categoriaId; }
    public void setCategoriaId(Long categoriaId) { this.categoriaId = categoriaId; }

    public AtividadeCategoriaPK() {}

    public AtividadeCategoriaPK(Long atividadeId, Long categoriaId) {
        this.atividadeId = atividadeId;
        this.categoriaId = categoriaId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AtividadeCategoriaPK that = (AtividadeCategoriaPK) o;
        return Objects.equals(atividadeId, that.atividadeId) && Objects.equals(categoriaId, that.categoriaId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(atividadeId, categoriaId);
    }
}