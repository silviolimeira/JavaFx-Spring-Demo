package com.sl.desafio;

import javax.annotation.PreDestroy;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties
public class MySpringContext {

	@Bean
	public ApplicationRunner applicationRunner(final InstallerApp application) {
		return new ApplicationRunner() {

			@Override
			public void run(final ApplicationArguments args) throws Exception {

			}

			@PreDestroy
			public void destroy() {

				// do application cleanup if needed

			}

		};
	}

}
