package io.partha.config.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.partha.domain.UserRepository;

@Configuration
public class MyConfigs {

	/*
	 * @Conditional(MyJobAConfigured.class)
	 * 
	 * @Bean public IMyJob myJobA() { return new MyJobA(); }
	 * 
	 * @Conditional(MyJobBConfigured.class)
	 * 
	 * @Bean public IMyJob myJobB() { return new MyJobB(); }
	 */
	@Autowired
	private UserRepository userRepository;
	@Bean
	public IMyJob myJob() {
		if(userRepository.search("partha").getActive())
			return new MyJobA();
		else
			return new MyJobB();
	}

}
