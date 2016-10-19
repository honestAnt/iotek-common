package com.iotekclass.common.junit;

import org.apache.log4j.Logger;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *@description BaseMapperTest：persistance公共单元测试基类,此处修改操作会在数据库提交(非事务)
 *
 *@author honestAnt
 *@date   2016/5/17 17:06
 *
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(locations={"classpath:/conf/spring-context.xml","classpath:/conf/spring-mybatis.xml",
        "classpath:/conf/spring-service.xml"})
public class BaseMapperTest {

    Logger logger = Logger.getLogger(BaseMapperTest.class);
}