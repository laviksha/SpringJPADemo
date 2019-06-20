package com.gfg.laviksha.SpringJPADemo.CommandLineRunner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.management.loading.ClassLoaderRepository;

//CLR-is a simple Spring Boot interface with a run method.
//Spring Boot will automatically call the run method of all beans implementing this
// interface after the application context has been loaded.

@Component
public class UserCrudCommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("running crud");
    }
}
