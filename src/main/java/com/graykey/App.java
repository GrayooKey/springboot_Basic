package com.graykey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App {

    @RequestMapping("/")
    String home(){
        return "hello springboot! 这是测试接口返回json数据。";
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
