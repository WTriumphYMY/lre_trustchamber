package cn.edu.nwpu.trustchamber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TrustchamberApplication {

    public static void main(String[] args) {
        SpringApplication.run(TrustchamberApplication.class, args);
    }

}
