package cn.van;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 *
 * @author Van
 * @since 2019.2.26
 */
@SpringBootApplication
public class SpringBootDemoAopApplication {

    private static final Logger logger = LoggerFactory.getLogger(SpringBootDemoAopApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoAopApplication.class);
        logger.info("SpringBootDemoAopApplication start!");
    }
}
