package com.chunduru.intellij.config;

import com.chunduru.intellij.dao.LibraryDao;
import com.chunduru.intellij.dao.impl.LibraryDaoImpl;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by sande on 3/29/2017.
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class AppConfiguration
{
    @Bean
    public LibraryDao libraryDao()
    {
        return new LibraryDaoImpl();
    }
}
