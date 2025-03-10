package br.com.diferpan.aulasdevsuperior.desafio02.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_atividade_bloco")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AtividadeBloco {
    @EmbeddedId
    private AtividadeBlocoPk id;

    @ManyToOne
    @MapsId("atividadeId")
    @JoinColumn(name = "atividade_id")
    private Atividade atividade;

    @ManyToOne
    @MapsId("blocoId")
    @JoinColumn(name = "bloco_id")
    private Bloco bloco;
}
