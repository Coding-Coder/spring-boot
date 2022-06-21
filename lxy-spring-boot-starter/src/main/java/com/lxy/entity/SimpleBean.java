package com.lxy.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@Data
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "simplebean")
public class SimpleBean {
	private int id;
	private String name = "lxy";
}
