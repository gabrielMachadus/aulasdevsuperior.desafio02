package br.com.diferpan.aulasdevsuperior.desafio02.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Setter
@Getter
@Embeddable
@AllArgsConstructor
@NoArgsConstructor
public class AtividadeCategoriaPK {
    @Column(name = "atividade_id")
    private Long atividade_id;
    @Column(name = "categoria_id")
    private Long categoria_id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AtividadeCategoriaPK that = (AtividadeCategoriaPK) o;
        return Objects.equals(atividade_id, that.atividade_id) && Objects.equals(categoria_id, that.categoria_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(atividade_id, categoria_id);
    }
}
