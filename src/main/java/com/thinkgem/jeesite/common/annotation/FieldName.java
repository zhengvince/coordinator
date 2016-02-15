package com.thinkgem.jeesite.common.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义一个注解@FieldName，表示bean中文名注解
 *
 * 详解：【@Target】注解可以修饰的类型，此处为可修饰方法
 * 		 【@Retention】注解的生命周期，此处为编译时有效
 *		 【@interface】自定义注解
 */
@Target(ElementType.METHOD)  
@Retention(RetentionPolicy.RUNTIME)  
public @interface FieldName {

	String value();
	
}
