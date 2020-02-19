package com.lwxie.logmongo.runner;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @author lwxie
 * @data 2020/2/19 11:39
 */
@Component
@Slf4j
public class NodeRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("mongo-info");
        log.warn("mongo-warn");
        log.error("mongo-error");
        log.debug("mongo-debug");
        System.out.println("gogogo");

    }
}
