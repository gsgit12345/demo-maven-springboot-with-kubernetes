package com.demo.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Hello world!
 *
 */
@SpringBootApplication
//@ComponentScan(basePackages = "com.demo.project")
@EnableJpaRepositories
@PropertySources({
        @PropertySource("classpath:student.properties")
})
public class mainapp
{
    public static void main( String[] args )
    {
        SpringApplication.run(mainapp.class,args);
        System.out.println( "Hello World!" );
    }
    //http://localhost:8080/student/id?id=1
}
