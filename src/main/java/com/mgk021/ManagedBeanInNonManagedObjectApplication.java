package com.mgk021;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ManagedBeanInNonManagedObjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManagedBeanInNonManagedObjectApplication.class, args);

        LegacyObject legacyObject = new LegacyObject();
        System.out.println(legacyObject.sendSms());
    }

}
