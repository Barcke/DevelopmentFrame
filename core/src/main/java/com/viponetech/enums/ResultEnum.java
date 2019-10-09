package com.viponetech.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @ProjectName developmentFrame
 * @ClassName ResultEnum
 * @Description TODO
 * @Author Administrator
 * @Date 2019/9/30 13:59
 * @Version 1.0
 **/
//生成无参构造
@NoArgsConstructor
//生成全参构造
@AllArgsConstructor
public enum ResultEnum {
    SUCCESS(200,"SUCCESS"),FAIL(400,"FAIL");

    @Getter
    private Integer code;

    @Getter
    private String msg;

}
