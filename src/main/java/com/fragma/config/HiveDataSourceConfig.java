package com.fragma.config;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;


@Configuration
@ConfigurationProperties(prefix = "hive.db")
public class HiveDataSourceConfig {
    private String driver;
    private String url;
    private String username;
    private String password;

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Bean(name = "hiveDataSource")
    public DataSource dataSource() {

       // SingleConnectionDataSource ds = new SingleConnectionDataSource();
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName(this.getDriver());
        ds.setUrl(this.getUrl());
        if (getUsername() != null && !getUsername().trim().equals("")) {
            ds.setUsername(getUsername());
            ds.setPassword(getPassword());
        }
         ds.setInitialSize(1);
   

        return ds;
    }

    @Bean(name = "hiveTranscationManager")
    public DataSourceTransactionManager dataSourceTransactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }

    @Bean(name = "hiveJdbcTemplate")
    public JdbcTemplate jdbcTemplate() {
        return new JdbcTemplate(dataSource());
    }

}
