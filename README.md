#Spring Boot集成MyBatis、shiro、thymeleaf的项目

#MyBatis3.3.0

#Spring Boot 1.3.0.RELEASE

项目使用Spring Boot 1.4.1.RELEASE + Mybatis3.3.0+shiro1.2.5+thymeleaf3.0.0.RELEASE

项目集成了Mybatis分页插件和通用Mapper插件

项目使用的mysql数据库，根据需要可以切换为其他数据库

##说明

虽然MyBatis官方提供了`mybatis-spring-boot-starter`，但是该配置的可以控制的地方太少，因此短时间不会直接使用该`starter`。

在集成MyBatis配置`MapperScannerConfigurer`需要特别注意，将该类单独放在一个配置文件中，例如本项目中的`MyBatisMapperScannerConfig`类：


##SSM集成的基础项目

###https://github.com/abel533/Mybatis-Spring

##MyBatis工具

###http://www.mybatis.tk

##推荐使用Mybatis通用Mapper3

###https://github.com/abel533/Mapper

##推荐使用Mybatis分页插件PageHelper

###https://github.com/pagehelper/Mybatis-PageHelper
