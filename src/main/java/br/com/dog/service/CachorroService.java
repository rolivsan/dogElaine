package br.com.dog.service;

import br.com.dog.dto.CachorroDTORequest;
import br.com.dog.usecase.CachorroUseCase;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CachorroService {

    private final CachorroUseCase cachorroUseCase;

    public CachorroService(CachorroUseCase cachorroUseCase) {
        this.cachorroUseCase = cachorroUseCase;
    }

    public List<CachorroDTORequest> getAllDogs() {
        List<CachorroDTORequest> cachorroDTO = cachorroUseCase.getAllDogs();
        return cachorroDTO;
    }
    public CachorroDTORequest getByIdDog(Long id){
        CachorroDTORequest cachorroDTO = cachorroUseCase.getByIdDog(id);
        return cachorroDTO;
    }

    //precisa retornar?? pode ser void?
    public CachorroDTORequest deleteByIdDog(Long id){
        CachorroDTORequest cachorroDTO = cachorroUseCase.deleteByIdDog(id);
        return cachorroDTO;
    }
}
