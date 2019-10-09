package com.viponetech.util;

import com.viponetech.enums.ResultEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.io.Serializable;

/**
 * @ProjectName developmentFrame
 * @ClassName Result
 * @Description TODO
 * @Author Administrator
 * @Date 2019/9/29 15:00
 * @Version 1.0
 **/
@Data
//生成无参构造
@NoArgsConstructor
//生成全参构造
@AllArgsConstructor
public class Result<T> implements Serializable {

    private Integer code;
    private String msg;
    private T data;
    private boolean status;

//    @NotNull判断是否为空
    public final static <T> Result<T> success(@NonNull T data){
        return new Result<T>(ResultEnum.SUCCESS.getCode(),ResultEnum.SUCCESS.getMsg(),data,true);
    }

    public final static <T> Result<T> error(){
        return new Result<T>(ResultEnum.FAIL.getCode(), ResultEnum.FAIL.getMsg(),null,false);
    }

    public final static <T> Result<T> success(){
        return new Result<T>(ResultEnum.SUCCESS.getCode(),ResultEnum.SUCCESS.getMsg(),null,true);
    }

    public final static <T> Result<T> error(@NonNull String msg){
        return new Result<T>(ResultEnum.FAIL.getCode(),msg,null,false);
    }

    public final static <T> Result<T> error(@NonNull Integer code,@NonNull String msg){
        return new Result<T>(code,msg,null,false);
    }
}
