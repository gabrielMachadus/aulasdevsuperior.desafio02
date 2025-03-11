package br.com.diferpan.aulasdevsuperior.desafio02.entities;

import jakarta.persistence.*;
import java.util.*;

@Entity
@Table(name = "tb_categoria")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;

    @OneToMany(mappedBy = "categoria")
    private Set<Atividade> atividades = new HashSet<>();

    @OneToMany(mappedBy = "categoria")
    private List<AtividadeCategoria> atividadeCategorias = new ArrayList<>();

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public Set<Atividade> getAtividades() { return atividades; }
    public void setAtividades(Set<Atividade> atividades) { this.atividades = atividades; }

    public Categoria() {}

    public Categoria(Long id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Categoria categoria = (Categoria) o;
        return Objects.equals(id, categoria.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}