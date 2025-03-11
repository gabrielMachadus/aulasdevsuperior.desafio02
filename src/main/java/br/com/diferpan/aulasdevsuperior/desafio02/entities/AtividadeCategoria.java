package br.com.diferpan.aulasdevsuperior.desafio02.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_atividade_categoria")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AtividadeCategoria {
    @EmbeddedId
    private AtividadeCategoriaPK id;

    @ManyToOne
    @MapsId("atividade_id")
    @JoinColumn(name = "atividade_id")
    private Atividade atividade;

    @ManyToOne
    @MapsId("atividade_id")
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;
}
