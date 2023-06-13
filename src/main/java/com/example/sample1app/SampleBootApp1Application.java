package com.example.sample1app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SampleBootApp1Application {

    String [][] data = {
        {"noname", "no email address", "0"},
        {"taro", "taro@yamada", "1"},
        {"hanako", "hanako@flower", "2"},
        {"sachiko", "sachiko@happy", "3"},
        {"ichiro", "ichiro@baseball", "4"}
    };
    public static void main(String[] args) {
        SpringApplication.run(SampleBootApp1Application.class, args);
    }

    @RequestMapping("/")
    public String index() {
        return "Hello World!";
    }

    @RequestMapping("/{num}")
    public String index2(@PathVariable int num) {
        int n = num  < 0 ? 0 : num >= data.length ? 0 : num;
        String[] item = data[n];
        String msg = "ID=%s, Name=%s, Email=%s, Age=%s";
        return String.format(msg, num, item[0], item[1], item[2]);
    }
}
