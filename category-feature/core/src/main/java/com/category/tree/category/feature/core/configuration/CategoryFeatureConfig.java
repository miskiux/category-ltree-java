package com.category.tree.category.feature.core.configuration;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories("com.category.tree.category.feature.core")
@EntityScan("com.category.tree.category.feature.core")
public class CategoryFeatureConfig {
}
