
package cn.pxh.content;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class ContentGatewayApp {

	public static void main(String[] args) {

		new SpringApplicationBuilder(ContentGatewayApp.class).run(args);
	}
}
