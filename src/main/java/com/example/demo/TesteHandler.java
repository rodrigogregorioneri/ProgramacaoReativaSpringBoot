package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class TesteHandler {

	private final TesteRepository repository;

	  public TesteHandler(TesteRepository repository) {
	    this.repository = repository;
	  }

	  public Mono<ServerResponse> getAllTeste(ServerRequest request) {
	    Flux<String> testes = repository.getAllTeste();
	    return ServerResponse.ok()
	        .contentType(MediaType.TEXT_PLAIN)
	        .body(testes, String.class);
	  }
}
