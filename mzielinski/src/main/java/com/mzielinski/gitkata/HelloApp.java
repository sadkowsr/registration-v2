package com.mzielinski.gitkata;

import com.mzielinski.gitkata.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloApp {

    public static void main(String[] args) {
        ApplicationContext ctx = initApplicationContext();
        HelloGitKataService gitKatService = ctx.getBean(HelloGitKataService.class);
        System.out.println(gitKatService.decryptMessage());
    }

    private static ApplicationContext initApplicationContext() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        return ctx;
    }

}
