package com.recruitmentprj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.sql.SQLException;

@SpringBootApplication
@ComponentScan("com.recruitmentprj")
@EnableAutoConfiguration
public class RecruitmentPrjApp {
    public static void main(String[] args) throws SQLException {
        DatabaseAccess.startDB();
        SpringApplication.run(RecruitmentPrjApp.class, args);
    }

}
