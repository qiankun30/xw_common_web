package com.xwcommon.xw_common_web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement  //如果mybatis中service实现类中加入事务注解，需要此处添加该注解
@MapperScan(basePackages="com.xwcommon.xw_common_web.dao")  //扫描的是mapper.xml中namespace指向值的包位置
public class XwCommonWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(XwCommonWebApplication.class, args);
	}
}
