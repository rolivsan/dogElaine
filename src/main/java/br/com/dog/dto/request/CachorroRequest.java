package br.com.dog.dto.request;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CachorroRequest {
    private Long id;
    private String decricao;
    private String energia;
    private String obdiencia;
    private String inteligencia;
    private String territorialiasta;
    private String apegoAoDono;
    private String tendenciaALatir;
    private String amizadeComCriancas;
    private String amizadeComOutrosAnimais;
}
