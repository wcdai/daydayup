package com.study.daydayup.day01.demo01;

import com.study.daydayup.DaydayupApplication;
import com.study.daydayup.day01.demo01.p1.Cat;
import com.study.daydayup.day01.demo01.p1.Dog;
import com.study.daydayup.day01.demo01.p2.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@ComponentScan
//直接引入类
//@Import({Cat.class, Dog.class})
//引入配置类
@Import(MyConfig.class)
public class demo01Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DaydayupApplication.class, args);
        Dog dog = context.getBean(Dog.class);
        Cat cat = context.getBean(Cat.class);
        System.out.println("cat = " + cat);
        System.out.println("dog = " + dog);

        context.close();
    }
}
