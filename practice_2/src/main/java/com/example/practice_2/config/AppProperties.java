package com.example.practice_2.config;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "app")
@Validated
public record AppProperties(@NotBlank String name, @NotBlank String version, @NotBlank String message){}
