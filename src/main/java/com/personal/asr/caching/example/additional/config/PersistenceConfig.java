package com.personal.asr.caching.example.additional.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.personal.asr.caching.example.core.repository")
@EnableJpaAuditing(auditorAwareRef = "auditorAwareImpl")
public class PersistenceConfig {
}
