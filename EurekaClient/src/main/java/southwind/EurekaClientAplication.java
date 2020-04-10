package southwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
* 两个application测试zuul的负载均衡,端口不一样(先启动一个application,然后修改端口在启动令一个application)
* */
@SpringBootApplication
public class EurekaClientAplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaClientAplication.class,args);
    }
}
