package br.com.dog.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Cachorro {
    @Id
    private Long id;
    private String decricao;
    private String energia;
    private String obdiencia;
    private String inteligencia;
    private String territorialiasta;
    private String apegoAoDono;
    private String tendenciaALatir;
    private String amizadeComCrianças;
    private String amizadeComOutrosAnimais;

}
