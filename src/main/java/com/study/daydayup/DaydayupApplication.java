package com.study.daydayup;

import com.study.daydayup.day01.demo01.p1.Cat;
import com.study.daydayup.day01.demo01.p1.Dog;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

/**
 * @author daiwencheng
 */
@SpringBootApplication
@Import({Cat.class, Dog.class})
public class DaydayupApplication {

    public static void main(String[] args) {
        SpringApplication.run(DaydayupApplication.class, args);
    }


}
