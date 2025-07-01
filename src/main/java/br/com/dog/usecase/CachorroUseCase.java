package br.com.dog.usecase;

import br.com.dog.dto.CachorroDTORequest;
import br.com.dog.service.CachorroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CachorroUseCase {

    @Autowired
    List<CachorroDTORequest> cachorroList;

    public List<CachorroDTORequest> getAllDogs(){
        return cachorroList;
    }
    public CachorroDTORequest getByIdDog(Long id){
        Long conta = id -1;
        int index = conta.intValue();
        CachorroDTORequest cachorro = cachorroList.get(index);

        return cachorro ;
    }
}
