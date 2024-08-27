package com.livemilton.accounts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.livemilton.accounts.dto.AccountsContactInfoDto;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@SpringBootApplication
/*
 * @ComponentScan({@ComponentScan("com.livemilton.accounts,controller")})
 * 
 * @EnableJpaRepositories("com.livemilton.accounts.repository")
 * 
 * @EntityScan("com.livemilton.accounts.model")
 */
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableConfigurationProperties(value = { AccountsContactInfoDto.class })
@OpenAPIDefinition(info = @Info(title = "Accounts microservice REST API DOcumentation", description = "livemiltonBank Accounts microservice REST API Documentation", version = "v1", contact = @Contact(name = "Milton Munoz", email = "livemilton@hotmail.com", url = "https://www.livemilton.com"), license = @License(name = "Apache 2.0", url = "https://www.livemilton.com")), externalDocs = @ExternalDocumentation(description = "LivemiltonBank Accounts microservice REST API Documentation", url = "http://www.livemilton.com/swagger-ui.html"))
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
