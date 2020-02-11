//
//package io.partha.config.beans;
//
//import org.springframework.context.annotation.Condition;
//import org.springframework.context.annotation.ConditionContext;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.type.AnnotatedTypeMetadata;
//
//import io.partha.domain.User;
//import io.partha.domain.UserRepository;
//
//@Configuration
//public class MyJobBConfigured implements Condition {
//
//	@Override
//	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
//		UserRepository bean = context.getBeanFactory().getBean(UserRepository.class);
//		User userMaitra = bean.search("partha");
//		if(userMaitra.getActive() == true)
//			return true;
//		return false;
//	}
//
//
//}
