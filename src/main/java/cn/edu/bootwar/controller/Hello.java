package cn.edu.bootwar.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @Value("${server.port}")
    private int port;
    @Value("${spring.application.name}")
    private String applicationNmae;
    @GetMapping("/hello")
    public String hello(){
        return "hello world , port: "+port+" , applicationNmae: " +applicationNmae ;
    }
}
