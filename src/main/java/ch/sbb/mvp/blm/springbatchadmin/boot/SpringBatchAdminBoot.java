package ch.sbb.mvp.blm.springbatchadmin.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.batch.BatchAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@EnableAutoConfiguration(exclude = {BatchAutoConfiguration.class, DataSourceAutoConfiguration.class,
        WebMvcAutoConfiguration.class})
@ImportResource({
        "classpath:/org/springframework/batch/admin/web/resources/webapp-config.xml",
        "classpath:/org/springframework/batch/admin/web/resources/servlet-config.xml"})
public class SpringBatchAdminBoot extends SpringBootServletInitializer {

    public static void main(final String[] args) {
        SpringApplication.run(SpringBatchAdminBoot.class, args);
    }

    /**
     * @see SpringBootServletInitializer#configure(SpringApplicationBuilder)
     */
    @Override
    protected SpringApplicationBuilder configure(final SpringApplicationBuilder application) {
        return application.sources(SpringBatchAdminBoot.class);
    }
}