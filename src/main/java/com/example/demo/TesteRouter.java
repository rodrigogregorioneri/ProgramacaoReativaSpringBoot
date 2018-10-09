package com.example.demo;

import static org.springframework.web.reactive.function.server.RequestPredicates.DELETE;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.PUT;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class TesteRouter {

	@Bean
	  public RouterFunction<ServerResponse> route(TesteHandler handler) {
	    return RouterFunctions.route(
	            GET("/testes").and(RequestPredicates.accept(MediaType.TEXT_PLAIN)),
	            handler::getAllTeste)
	        .andRoute(
	            GET("/testes/fn/{fn}/ln/{ln}")
	                .and(RequestPredicates.accept(MediaType.TEXT_PLAIN)),
	            handler::getAllTeste)
	        .andRoute(
	            PUT("/teste").and(RequestPredicates.accept(MediaType.TEXT_PLAIN)),
	            handler::getAllTeste)
	        .andRoute(
	            DELETE("/testes/id/{id}").and(RequestPredicates.accept(MediaType.TEXT_PLAIN)),
	            handler::getAllTeste)
	        .andRoute(
	            GET("/test").and(RequestPredicates.accept(MediaType.TEXT_PLAIN)),
	            handler::getAllTeste);
	  }
}
