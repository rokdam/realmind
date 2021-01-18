package org.realmind;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value= {"org.realmind.mapper"})
public class RealmindApplication {

    public static void main(String[] args) {
        SpringApplication.run(RealmindApplication.class, args);
    }

}
