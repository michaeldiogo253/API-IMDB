package br.com.impdapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequiredArgsConstructor
public class ListarTop250FilmesImdbController {

	private final RestTemplate restTemplate;

	@GetMapping("/listar-top-250-filmes/{apiKey}")
	public ResponseEntity<String> listarTop250filmes(@PathVariable String apiKey) {

		String  url ="https://imdb-api.com/en/API/Top250Movies/"+ apiKey;

		return restTemplate.getForEntity(url, String.class);
	}

}
