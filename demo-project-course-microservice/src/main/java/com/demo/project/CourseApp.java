package com.demo.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Hello world!
 *
 */
@SpringBootApplication
//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@EnableJpaRepositories
@PropertySources({
        @PropertySource("classpath:course.properties")
})
public class CourseApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(CourseApp.class,args);

        System.out.println( "Hello World!" );
    }
}
