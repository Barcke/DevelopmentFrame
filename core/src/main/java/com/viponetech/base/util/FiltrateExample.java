package com.viponetech.base.util;

import tk.mybatis.mapper.entity.Example;

/**
 * @ProjectName developmentFrame
 * @ClassName BaseQuery
 * @Description TODO
 * @Author Administrator
 * @Date 2019/9/30 15:29
 * @Version 1.0
 **/
public interface FiltrateExample<T> {
    void filtrate(Example example);
}
