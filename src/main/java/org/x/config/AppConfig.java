package org.x.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.x.domain.User;

@Configuration
public class AppConfig {

    @Bean
    public User user() {
        User user = new User();
        user.setName("hello");
        return user;
    }
}
