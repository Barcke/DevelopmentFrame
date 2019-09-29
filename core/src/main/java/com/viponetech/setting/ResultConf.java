package com.viponetech.setting;

import lombok.Getter;

/**
 * @ProjectName developmentFrame
 * @ClassName ResultConf
 * @Description TODO
 * @Author Administrator
 * @Date 2019/9/29 15:32
 * @Version 1.0
 **/
public final class ResultConf {

    private ResultConf(){

    }

    @Getter
    private final static Integer SUCCESS_CODE=200;
    @Getter
    private final static Integer ERROR_CODE=400;
    @Getter
    private final static String SUCCESS_MSG="SUCCESS";
    @Getter
    private final static String ERROR_MSG="ERROR";
    
}
