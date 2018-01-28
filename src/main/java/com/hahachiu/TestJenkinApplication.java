package com.hahachiu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;


@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan(basePackages = { "com.hahachiu" })
/*public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);

	}


}*/
public class TestJenkinApplication extends SpringBootServletInitializer {
	/* *
      * 实现SpringBootServletInitializer可以让spring-boot项目在web容器中运行
      */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		builder.sources(this.getClass());
		return super.configure(builder);
	}

	public static void main(String[] args) {
		SpringApplication.run(TestJenkinApplication.class, args);

	}
}