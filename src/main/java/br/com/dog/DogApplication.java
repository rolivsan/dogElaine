package br.com.dog;

import br.com.dog.dto.CachorroDTORequest;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DogApplication {

	public static void main(String[] args) {
		SpringApplication.run(DogApplication.class, args);
	}


	@Bean
	public List<CachorroDTORequest> cachorroList(){
		List<CachorroDTORequest> cachorroList = new ArrayList<>();
		cachorroList.add(new CachorroDTORequest(1L,"Rex", "Labrador", 5));
		cachorroList.add(new CachorroDTORequest(2L,"Mel", "Beagle", 3));
		cachorroList.add(new CachorroDTORequest(3L,"Bob", "Golden Retriever", 4));

		return cachorroList;
	}

}
