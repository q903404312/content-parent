
package cn.pxh.content;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UserCenterProvider {

	public static void main(String[] args) {

		new SpringApplicationBuilder(UserCenterProvider.class).run(args);
	}
}
