package org.x;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.x.config.AppConfig;
import org.x.domain.User;

public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        User user = context.getBean(User.class);
        System.out.println(user);
    }
}
