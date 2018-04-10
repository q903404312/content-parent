
package cn.pxh.content;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ContentServerApp {

	public static void main(String[] args) {

		new SpringApplicationBuilder(ContentServerApp.class).run(args);
	}
}
