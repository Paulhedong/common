package io.sltstatistic.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhaozhihong
 * @create 2017-12-28 18:25
 * @desc 数据源配置
 **/
@Configuration
public class DataSourceConfig {

    @Bean(name = "firenzeDataSource")
    @ConfigurationProperties(prefix="spring.datasource.firenze")
    public DataSource defaultDataSource(){
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "turinDataSource")
    @ConfigurationProperties(prefix="spring.datasource.turin")
    public DataSource turinDataSource(){
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "bariDataSource")
    @ConfigurationProperties(prefix="spring.datasource.bari")
    public DataSource bariDataSource(){
        return DataSourceBuilder.create().build();
    }

    @Primary
    @Bean(name = "dynamicDataSource")
    public DataSource dynamicDataSource(){
        DynamicDataSource dynamicDataSource = new DynamicDataSource();
        dynamicDataSource.setDefaultTargetDataSource(defaultDataSource());
        Map<Object, Object> dataSourceMap = new HashMap<>();
        dataSourceMap.put("firenze", defaultDataSource());
        dataSourceMap.put("turin", turinDataSource());
        dataSourceMap.put("bari", bariDataSource());
        dynamicDataSource.setTargetDataSources(dataSourceMap);
        DynamicDataSourceThreadHolder.dataSourceList.addAll(dataSourceMap.keySet());
        return dynamicDataSource;
    }


    @Bean
    public DataSourceTransactionManager transactionManager(){
        return new DataSourceTransactionManager(dynamicDataSource());
    }


    @Bean
    @ConfigurationProperties(prefix = "mybatis")
    public SqlSessionFactoryBean sqlSessionFactory(){
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dynamicDataSource());
        return sqlSessionFactoryBean;
    }
}
