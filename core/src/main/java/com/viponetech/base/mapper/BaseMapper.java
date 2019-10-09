package com.viponetech.base.mapper;

import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.ExampleMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @ProjectName developmentFrame
 * @ClassName MyMapper
 * @Description TODO
 * @Author Administrator
 * @Date 2019/9/29 14:15
 * @Version 1.0
 **/
public interface BaseMapper<T> extends tk.mybatis.mapper.common.BaseMapper<T>, MySqlMapper<T>, IdsMapper<T>, ConditionMapper<T>, ExampleMapper<T> {
    //这里实现一个自己的接口,继承通用的mapper，关键点就是这个接口不能被扫描到(不加注解就不会被扫描到)，
}
