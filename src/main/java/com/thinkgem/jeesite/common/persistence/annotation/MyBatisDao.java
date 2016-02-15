/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.common.persistence.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.stereotype.Component;

/**
 * 标识MyBatis的DAO,方便{@link org.mybatis.spring.mapper.MapperScannerConfigurer}的扫描。
 *
 * 【@Retention】此注解的生命周期，RUNTIME = 在运行时有效（即运行时保留）
 * 【@Target】此注解的使用范围，ElementType.TYPE = 用于描述类、接口(包括注解类型) 或enum声明
 * 【@Documented】此注解应该被作为被标注的程序成员的公共API，因此可以被例如javadoc此类的工具文档化。
 * 【@Component】此注解为Spring框架扫描的组件
 *
 * @author thinkgem
 * @version 2013-8-28
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Component
public @interface MyBatisDao {
	
	/**
	 * The value may indicate a suggestion for a logical component name,
	 * to be turned into a Spring bean in case of an autodetected component.
	 * @return the suggested component name, if any
	 */
	String value() default "";

}