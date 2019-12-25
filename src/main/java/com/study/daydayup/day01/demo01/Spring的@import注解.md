#### @Import

> 在应用中，有时没有把某个类注入到IOC容器中，但在运用的时候需要获取该类对应的bean，此时就需要用到@Import

__注意:__  
  ```java
  SpringApplication.run()方法启动类，需在@import引入的类的父包里面
  ```