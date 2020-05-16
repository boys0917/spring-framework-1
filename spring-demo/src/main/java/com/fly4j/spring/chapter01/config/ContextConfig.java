package com.fly4j.spring.chapter01.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.fly4j.spring.chapter01.**")
public class ContextConfig {
}