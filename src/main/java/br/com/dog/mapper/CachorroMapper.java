package br.com.dog.mapper;

import br.com.dog.dto.request.CachorroRequest;
import br.com.dog.dto.response.CachorroResponse;
import br.com.dog.model.Cachorro;

public class CachorroMapper {

    public static Cachorro toEntity (CachorroRequest request){
        return Cachorro.builder()
                .id(request.getId())
                .amizadeComCriancas(request.getAmizadeComCriancas())
                .energia(request.getEnergia())
                .apegoAoDono(request.getApegoAoDono())
                .decricao(request.getDecricao())
                .inteligencia(request.getInteligencia())
                .obdiencia(request.getObdiencia())
                .tendenciaALatir(request.getTendenciaALatir())
                .territorialiasta(request.getTerritorialiasta())
                .amizadeComOutrosAnimais(request.getAmizadeComOutrosAnimais())
                .build();
    }
    public static CachorroResponse toResponse (Cachorro cachorro){
        return CachorroResponse.builder()
                .id(cachorro.getId())
                .amizadeComCriancas(cachorro.getAmizadeComCriancas())
                .energia(cachorro.getEnergia())
                .apegoAoDono(cachorro.getApegoAoDono())
                .decricao(cachorro.getDecricao())
                .inteligencia(cachorro.getInteligencia())
                .obdiencia(cachorro.getObdiencia())
                .tendenciaALatir(cachorro.getTendenciaALatir())
                .territorialiasta(cachorro.getTerritorialiasta())
                .amizadeComOutrosAnimais(cachorro.getAmizadeComOutrosAnimais())
                .build();
    }
}
