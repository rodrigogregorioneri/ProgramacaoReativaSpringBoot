package com.example.demo;

import org.springframework.stereotype.Component;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class TesteRepository {

	
	  Flux<String> getAllTeste() {


		  Mono<String> testeFlowable = Mono.just("JSA");

		    return Flux.from(testeFlowable);
		  }
	
	
}
