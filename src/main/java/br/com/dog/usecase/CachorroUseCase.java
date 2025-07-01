package br.com.dog.usecase;

import br.com.dog.dto.CachorroDTORequest;
import br.com.dog.service.CachorroService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CachorroUseCase {

    private CachorroService  cachorroService;

    public List<CachorroDTORequest> getAllDogs(){

        List<CachorroDTORequest> cachorroList = new ArrayList<>();
        cachorroList.add(new CachorroDTORequest(1L,"Rex", "Labrador", 5));
        cachorroList.add(new CachorroDTORequest(2L,"Fido", "Beagle", 3));
        cachorroList.add(new CachorroDTORequest(3L,"Buddy", "Golden Retriever", 4));

        return cachorroList;
    }
    public CachorroDTORequest getByIdDog(Long id){
        List<CachorroDTORequest> cachorroList = new ArrayList<>();
        cachorroList.add(new CachorroDTORequest(1L,"Rex", "Labrador", 5));
        cachorroList.add(new CachorroDTORequest(2L,"Fido", "Beagle", 3));
        cachorroList.add(new CachorroDTORequest(3L,"Buddy", "Golden Retriever", 4));
        Long conta = id -1;
        int index = conta.intValue();
        CachorroDTORequest cachorro = cachorroList.get(index);

        return cachorro ;
    }
}
