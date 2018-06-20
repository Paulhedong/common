package io.sltstatistic.aspect;

import io.sltstatistic.annotation.TargetDataSource;
import io.sltstatistic.config.DynamicDataSourceThreadHolder;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by user on 2017/12/29.
 */
@Aspect
@Order(-1)
@Component
public class DynamicDataSourceAspect {
    private static final Logger logger = LoggerFactory.getLogger(DynamicDataSourceAspect.class);


    @Before("@annotation(targetDataSource)")
    public void switchDataSource(JoinPoint jp, TargetDataSource targetDataSource){
        if(!DynamicDataSourceThreadHolder.containDataSourceKey(targetDataSource.value())){
            logger.error("have no datasource:{}", targetDataSource);
        }
        else{
            DynamicDataSourceThreadHolder.putCurrentSourceName(targetDataSource.value());
            logger.info("switch to datasource:{}", targetDataSource);
        }
    }


    @After("@annotation(targetDataSource)")
    public void  setDefaultDataSource(JoinPoint jp, TargetDataSource targetDataSource){
        DynamicDataSourceThreadHolder.clearDataSourceHolder();
        logger.info("reset datasource to default");
    }
}
