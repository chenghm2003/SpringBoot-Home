package cn.van.logback;

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
public class LogbackApplication {

    private static final Logger logger = LoggerFactory.getLogger(LogbackApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(LogbackApplication.class, args);
        logger.trace("trace level log input");
        logger.debug("debug level log input");
        logger.info("info level log input");
        logger.warn("warn level log input");
        logger.error("error level log input");
    }
}
