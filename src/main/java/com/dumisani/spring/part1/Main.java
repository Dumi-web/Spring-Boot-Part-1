package com.dumisani.spring.part1;

import com.dumisani.spring.part1.wsdl.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.net.MalformedURLException;
import java.net.URL;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        UserServicesImpl users = new UserServicesImpl();
        SpringApplication.run(Main.class, args);
        System.out.println(users.addUser(1,"Dumisani","Ngobeni"));
        System.out.println(users.getUser(1));
        System.out.println(users.getUser(1));
        System.out.println(users.removeUser(1));
    }



    }
}



