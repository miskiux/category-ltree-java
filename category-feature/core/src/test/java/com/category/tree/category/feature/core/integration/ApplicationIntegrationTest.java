package com.category.tree.category.feature.core.integration;

import static org.assertj.core.api.Assertions.assertThat;

import com.category.tree.category.feature.core.ApplicationTest;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;

// TODO: fix integration tests. Application context is not passed.
@ApplicationTest
class ApplicationIntegrationTest {

    @Test
    void contextLoads(ApplicationContext context) {
        assertThat(context).isNotNull();
    }
}