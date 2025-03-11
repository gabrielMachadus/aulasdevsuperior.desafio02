package br.com.diferpan.aulasdevsuperior.desafio02.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_atividade_bloco")
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

    public AtividadeBlocoPk getId() { return id; }
    public void setId(AtividadeBlocoPk id) { this.id = id; }
    public Atividade getAtividade() { return atividade; }
    public void setAtividade(Atividade atividade) { this.atividade = atividade; }
    public Bloco getBloco() { return bloco; }
    public void setBloco(Bloco bloco) { this.bloco = bloco; }

    public AtividadeBloco() {}

    public AtividadeBloco(AtividadeBlocoPk id, Atividade atividade, Bloco bloco) {
        this.id = id;
        this.atividade = atividade;
        this.bloco = bloco;
    }
}