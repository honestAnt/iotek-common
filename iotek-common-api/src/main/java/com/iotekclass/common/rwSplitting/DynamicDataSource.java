package com.iotekclass.common.rwSplitting;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * Created by lzq on 2016/3/24.
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

    /**
     *  AbstractRoutingDataSource中的抽象方法determineCurrentLookupKey是实现数据源的route的核心.
     *  这里对该方法进行Override。
     * @return
     */
    @Override
    protected Object determineCurrentLookupKey() {
        return DbContextHolder.getDbType();
    }
}


