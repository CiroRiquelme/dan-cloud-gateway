package utn.isi.dan.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DanCloudGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(DanCloudGatewayApplication.class, args);
	}

}
