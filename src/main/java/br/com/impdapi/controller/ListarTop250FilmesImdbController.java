package br.com.impdapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URISyntaxException;

@RestController
@RequiredArgsConstructor
public class ListarTop250FilmesImdbController {

	private final RestTemplate restTemplate;

	@GetMapping("/listar-top-250-filmes")
	public ResponseEntity<String> listarTop250filmes() throws URISyntaxException {

		String  url ="https://imdb-api.com/en/API/Top250Movies/k_gbfa09ou";

		ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);

		return response;
	}

}
