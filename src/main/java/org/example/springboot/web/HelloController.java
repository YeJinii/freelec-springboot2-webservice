package org.example.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //컨트롤러를 JSON을 반환하는 컨트롤러로 만들어 줌
public class HelloController {

    @GetMapping("/hello") //HTTP Method인 Get의 요청을 받을수 있는 API를 만들어줌
    public String hello(){
        return "hello";
    }
}
