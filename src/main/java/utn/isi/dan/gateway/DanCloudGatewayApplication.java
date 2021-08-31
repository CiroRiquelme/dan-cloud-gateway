package utn.isi.dan.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@EnableDiscoveryClient
@RestController
@CrossOrigin(origins = "*", allowCredentials = "true", allowedHeaders = "*")
public class DanCloudGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(DanCloudGatewayApplication.class, args);
	}
	

}
