package com.study.daydayup.day01.demo01;

import com.study.daydayup.DaydayupApplication;
import com.study.daydayup.day01.demo01.p1.Cat;
import com.study.daydayup.day01.demo01.p1.Dog;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@ComponentScan
@Import({Cat.class, Dog.class})
public class demo01Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DaydayupApplication.class, args);
        /*Dog dog = context.getBean(Dog.class);
        Cat cat = context.getBean(Cat.class);
        System.out.println("cat = " + cat);
        System.out.println("dog = " + dog);*/
        System.out.println(context.getBean(Dog.class));
        System.out.println(context.getBean(Cat.class));

        context.close();
    }
}
