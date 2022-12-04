package com.personal.asr.caching.example.additional.config;

import java.util.Optional;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;

@Configuration
public class AuditorAwareImpl implements AuditorAware<String> {

  @Override
  public Optional<String> getCurrentAuditor() {

    // Hardcoded Auditor as `APP` for now, till we don't have Spring boot Security.
    return Optional.of("APP");
  }

}