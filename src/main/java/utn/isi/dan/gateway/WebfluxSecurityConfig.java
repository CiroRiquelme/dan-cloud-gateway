package utn.isi.dan.gateway;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;


@EnableWebFluxSecurity
public class WebfluxSecurityConfig {
	
	@Bean
	public SecurityWebFilterChain securitygWebFilterChain(
	  ServerHttpSecurity http) {
	    return http.authorizeExchange()
	    		
	    		.anyExchange().permitAll()
	      
	    		
	      .and().build();
	}

}
