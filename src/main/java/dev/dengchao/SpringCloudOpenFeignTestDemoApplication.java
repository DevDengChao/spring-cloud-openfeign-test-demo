package dev.dengchao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SpringCloudOpenFeignTestDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudOpenFeignTestDemoApplication.class, args);
    }
}
