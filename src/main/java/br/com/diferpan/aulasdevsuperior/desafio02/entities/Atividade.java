package br.com.diferpan.aulasdevsuperior.desafio02.entities;

import jakarta.persistence.*;
import java.util.*;

@Entity
@Table(name = "tb_atividade")
public class Atividade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    private String nome;
    private Double preco;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;



    @OneToMany(mappedBy = "atividade")
    private List<AtividadeBloco> atividadeBlocos = new ArrayList<>();

    @OneToMany(mappedBy = "atividade")
    private List<AtividadeCategoria> atividadeCategorias = new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name = "tb_participante_atividade",
            joinColumns = @JoinColumn(name = "atividade_id"),
            inverseJoinColumns = @JoinColumn(name = "participante_id"))
    private Set<Participante> participantes = new HashSet<>();

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public Double getPreco() { return preco; }
    public void setPreco(Double preco) { this.preco = preco; }
    public Categoria getCategoria() { return categoria; }
    public void setCategoria(Categoria categoria) { this.categoria = categoria; }
    public Set<Participante> getParticipantes() { return participantes; }
    public void setParticipantes(Set<Participante> participantes) { this.participantes = participantes; }


    public Atividade() {}

    public Atividade(Long id, String descricao, String nome, Double preco, Categoria categoria) {
        this.id = id;
        this.descricao = descricao;
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Atividade atividade = (Atividade) o;
        return Objects.equals(id, atividade.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}