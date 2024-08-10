package com.livemilton.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
/*@ComponentScan({@ComponentScan("com.livemilton.accounts,controller")})
@EnableJpaRepositories("com.livemilton.accounts.repository")
@EntityScan("com.livemilton.accounts.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info=@Info(
				title="Accounts microservice REST API DOcumentation",
				description = "livemiltonBank Accounts microservice REST API Documentation",
				version = "v1",
				contact= @Contact(
						name= "Milton Munoz",
						email="livemilton@hotmail.com",
						url="https://www.livemilton.com"
				),
				license = @License(
						name="Apache 2.0",
						url = "https://www.livemilton.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "LivemiltonBank Accounts microservice REST API Documentation",
				url = "http://www.livemilton.com/swagger-ui.html"
		)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
