package com.kandytan.util;

import org.mybatis.spring.SqlSessionTemplate;

import javax.annotation.Resource;

/**
 * @author Kandy Tan
 * @since 1.0
 */
public class DaoBase {

    @Resource
    protected SqlSessionTemplate sqlSessionTemplate;

}
