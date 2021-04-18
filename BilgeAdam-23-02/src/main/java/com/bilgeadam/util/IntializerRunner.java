package com.bilgeadam.util;

import com.bilgeadam.model.User;
import com.bilgeadam.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class IntializerRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(IntializerRunner.class);

    @Autowired
    UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        userRepository.deleteAll();

        userRepository.save(User.builder().name("Ali").email("a@a.com").age(27).build());
        userRepository.save(User.builder().name("Hsan").email("h@a.com").age(45).build());
        userRepository.save(User.builder().name("Fatma").email("f@a.com").age(18).build());

        userRepository.findAll().forEach(user -> logger.info("{}",user));
    }
}
