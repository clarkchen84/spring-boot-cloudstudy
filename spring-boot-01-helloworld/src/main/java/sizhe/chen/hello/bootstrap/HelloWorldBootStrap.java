package sizhe.chen.hello.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: sizhe.chen
 * @Date: Create in 10:24 上午 2021/2/14
 * @Description:
 * @Modified:
 * @Version:
 */

@SpringBootApplication
@RestController
public class HelloWorldBootStrap {
    public static void main(String[] args) {
        SpringApplication.run(HelloWorldBootStrap.class,args);
    }

    @GetMapping("/hello-world")
    public String helloWorld(){
        return "hello world";
    }
}
