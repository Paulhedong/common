package io.sltstatistic.config;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @author zhaozhihong
 * @create 2017-12-28 18:32
 * @desc 动态数据源
 **/
public class DynamicDataSource extends AbstractRoutingDataSource{


    @Override
    protected Object determineCurrentLookupKey() {
        return DynamicDataSourceThreadHolder.getCurrentSourceName();
    }

}
