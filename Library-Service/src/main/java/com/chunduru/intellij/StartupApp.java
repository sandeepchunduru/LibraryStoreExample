package com.chunduru.intellij;

import com.chunduru.intellij.config.AppConfiguration;
import com.chunduru.intellij.config.DataLayerConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by sande on 3/29/2017.
 */
@SpringBootApplication
public class StartupApp
{
    public static void main(String[] args)
    {
        SpringApplication app = new SpringApplication(DataLayerConfiguration.class, AppConfiguration.class);
        app.run(StartupApp.class, args);
    }
}
