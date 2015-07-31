package de.akquinet.engineering.vaadin.javascriptplus.demo;

import javax.servlet.Servlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.RegistrationBean;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class JavaScriptPlusDemoApplication extends SpringBootServletInitializer
{

    @Bean
    public RegistrationBean vaangularServlet(final ApplicationContext context)
    {
        final Servlet servlet = new JavaScriptPlusDemoServlet();
        return new ServletRegistrationBean(servlet, "/*");
    }

    @Override
    protected SpringApplicationBuilder configure(final SpringApplicationBuilder application)
    {
        return application.sources(JavaScriptPlusDemoApplication.class);
    }

    public static void main(final String... args)
    {
        SpringApplication.run(JavaScriptPlusDemoApplication.class, args);
    }

}
