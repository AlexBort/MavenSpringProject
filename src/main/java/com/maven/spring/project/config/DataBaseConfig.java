package com.maven.spring.project.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;

/**
 * Created by User on 21.02.2017.
 */


/* ПИШЕМ КОНФИГУРАЦИЮ ДЛЯ БД*/
@Configuration // эта аннотация говорит о том, что мы будем использовать конфигурацию
@EnableJpaRepositories("com.maven.spring.project.repository") // будем использовать JPA
@EnableTransactionManagement // транзакционность позволяет откатить версию БД, если мы в ней сделали какую-то ошибку
@ComponentScan("com.maven.spring.project")
public class DataBaseConfig {


    @Resource
    private Environment environment; // сможем иметь доступ к propertie файлам


}
