/**
 * 项目名称：quickstart-spring-boot-web-example 
 * 文件名：EnableSomeBeansSelector.java
 * 版本信息：
 * 日期：2018年9月22日
 * Copyright yangzl Corporation 2018
 * 版权所有 *
 */
package org.quickstart.spring.boot.web.example.test;

/**
 * EnableSomeBeansSelector 
 *  
 * @author：youngzil@163.com
 * @2018年9月22日 下午11:26:01 
 * @since 1.0
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.context.annotation.Import;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(SomeBeanConfigurationSelector.class)
public @interface EnableSomeBeansSelector {
    String criteria() default "default";
}
