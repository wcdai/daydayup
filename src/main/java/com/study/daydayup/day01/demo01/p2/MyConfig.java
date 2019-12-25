package com.study.daydayup.day01.demo01.p2;

import com.study.daydayup.day01.demo01.p1.Cat;
import com.study.daydayup.day01.demo01.p1.Dog;
import org.springframework.context.annotation.Bean;

public class MyConfig {

    @Bean
    public Dog getog() {
        return new Dog();
    }
    @Bean
    public Cat getCat() {
        return new Cat();
    }
}
