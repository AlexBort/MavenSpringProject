package com.maven.spring.project.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by User on 13.02.2017.
 */

@Configuration /*говорит о том, что этот класс является конфигурацией, которую надо развернуть перед тем, как работать со спрингом в этом проекте*/
@EnableWebMvc // говорит о том, что надо включить режим web mvc
@ComponentScan ("com.maven.spring.project") // говорит о том, где искать все наши БИНЫ: классы, компоненты, сервисы, репозитории
public class WebConfig extends WebMvcConfigurerAdapter {

}
