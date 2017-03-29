package com.chunduru.intellij;

import com.chunduru.intellij.config.AppConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by sande on 3/29/2017.
 */
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
public class StartupApp
{
    public static void main(String[] args)
    {
        SpringApplication app = new SpringApplication(AppConfiguration.class);
        app.run(StartupApp.class, args);
    }
}
