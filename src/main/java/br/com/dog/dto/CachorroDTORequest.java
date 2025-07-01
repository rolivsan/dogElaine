package br.com.dog.dto;

import lombok.Data;

@Data
public class CachorroDTORequest {
    private Long id;
    private String nome;
    private String raca;
    private int idade;

    public CachorroDTORequest(Long id, String nome, String raca, int idade) {
        this.id = id;
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }


}
