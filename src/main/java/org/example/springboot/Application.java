package org.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication //스프링 부트와 스프링Bean 읽기/생성이 자동으로 설정됨
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args); //내장 WAS를 사용 ? 언제 어디서나 같은 환경에서 스프링 부트 배포 가능
    }
}
