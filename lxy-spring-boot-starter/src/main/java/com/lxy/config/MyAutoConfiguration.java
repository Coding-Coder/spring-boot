package com.lxy.config;

import com.lxy.entity.SimpleBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnBean(ConfigMarker.class)//上下文中必须存在ConfigMarker这个bean时，当前配置类才会生效
public class MyAutoConfiguration {

	static {
		System.out.println("lxy-spring-boot-starter MyAutoConfiguration init.... ");
	}

	@Bean
	public SimpleBean simpleBean() {
		return new SimpleBean();
	}

}
