package br.com.diferpan.aulasdevsuperior.desafio02.entities;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class AtividadeBlocoPk implements Serializable {
    private int atividadeId;
    private int blocoId;
}
