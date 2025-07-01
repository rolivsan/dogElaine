package br.com.dog.controller;

import br.com.dog.dto.CachorroDTORequest;
import br.com.dog.service.CachorroService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/dog")
public class Controller {

    private final CachorroService cachorroService;

    public Controller(CachorroService cachorroService) {
        this.cachorroService = cachorroService;
    }


    @GetMapping
    public ResponseEntity<List<CachorroDTORequest>> getAllDogs() {
        List<CachorroDTORequest> cachorroList = cachorroService.getAllDogs();
        return ResponseEntity.ok(cachorroList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CachorroDTORequest> getByIdDog(@PathVariable Long id) {
        CachorroDTORequest cachorro = cachorroService.getByIdDog(id);
        return ResponseEntity.ok(cachorro);
    }

    //TODO Elaine para prox aula implementar o metodo de delete que vai deletar da nossa lista de cachorro
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        //Implementar o código
        return ResponseEntity.noContent().build();
    }

}
