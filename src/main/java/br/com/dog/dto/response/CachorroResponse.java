package br.com.dog.dto.response;

import lombok.Builder;

@Builder
public class CachorroResponse {
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
