package sn.isi.l3gl.core.config;

import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages = "sn.isi.l3gl.core")
@EnableJpaRepositories(basePackages = "sn.isi.l3gl.core.repository")
@EntityScan(basePackages = "sn.isi.l3gl.core.entity")
public class ProductCoreConfig {
}
