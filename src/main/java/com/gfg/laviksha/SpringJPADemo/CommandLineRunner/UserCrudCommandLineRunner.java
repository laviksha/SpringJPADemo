package com.gfg.laviksha.SpringJPADemo.CommandLineRunner;

import com.gfg.laviksha.SpringJPADemo.Repository.UserRepository;
import com.gfg.laviksha.SpringJPADemo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.management.loading.ClassLoaderRepository;
import java.util.List;

//CLR-is a simple Spring Boot interface with a run method.
//Spring Boot will automatically call the run method of all beans implementing this
// interface after the application context has been loaded.

@Component
public class UserCrudCommandLineRunner implements CommandLineRunner {
    @Autowired
    UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        //System.out.println("running crud");

    User user1=new User("Laviksha","soni");
    userRepository.save(user1);

        User user2=new User("Uncle","soni");
        userRepository.save(user2);
/*
        //too get all the user
        System.out.println("before deletion");
        List<User> users=userRepository.findAll();
        System.out.println(users);


        userRepository.delete(user1);
        users= userRepository.findAll();
        System.out.println("after deletion");
        System.out.println(users);


        //no update method...use save only
        user2.setFirstName("lavi");
        userRepository.save(user2);
        users=userRepository.findAll();
        System.out.println("after update user2");
        System.out.println(users);
*/


        User user3=new User("Shivam","soni");
        userRepository.save(user3);

        List<User> users=userRepository.findByFirstName("Shivam");
        System.out.println("user with first name as shivam"+users);


        List<User> users1=userRepository.findByFirstNameAndLastName("Laviksha","soni");
        System.out.println("user"+users1);
    }
}
