package com.iotekclass.common.junit;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/** service层测试基类
 * Created by honestAnt on 2016/5/17.
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(locations={"classpath:/conf/spring-context.xml","classpath:/conf/spring-mybatis.xml",
        "classpath:/conf/spring-service.xml","classpath:/dubbo/applicationContext-dubbo-provider.xml"})
public class BaseServiceTest {

}