package in.ari.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
//@EnableSwagger2

public class SwaggerConfig {
	/*@Bean
public Docket apiDoc() {
		
		return new Docket(DocumentationType.SWAGGER_2)
				   .select()
				   .apis(RequestHandlerSelectors.basePackage("in.ashokit.rest"))
				   .paths(PathSelectors.any())
				   .build();
	}*/
	@Bean
	public OpenAPI customOpenAPI() {
	    return new OpenAPI()
	            .info(new io.swagger.v3.oas.models.info.Info()
	                    .title("Book API")
	                    .version("1.0"));
	}


}
