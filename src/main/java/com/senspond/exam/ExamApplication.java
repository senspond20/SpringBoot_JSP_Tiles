package com.senspond.exam;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Slf4j
@SpringBootApplication
public class ExamApplication {

    private static final boolean IS_LOCAL = true;

    public static void main(String[] args) {
        SpringApplication.run(ExamApplication.class, args);
    }

    /**
     * 초기 구동
     */
    @Component
    static class InitRunner implements CommandLineRunner {

        @Override
        public void run(String... args) throws Exception {
            log.info("초기 구동");
            if(IS_LOCAL){

            }
        }
    }

}
