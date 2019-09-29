package com.viponetech.util;

import com.viponetech.setting.ResultConf;
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
        return new Result<T>(ResultConf.getSUCCESS_CODE(),ResultConf.getSUCCESS_MSG(),data,true);
    }

    public final static <T> Result<T> error(){
        return new Result<T>(ResultConf.getERROR_CODE(),ResultConf.getERROR_MSG(),null,false);
    }

    public final static <T> Result<T> success(){
        return new Result<T>(ResultConf.getSUCCESS_CODE(),ResultConf.getSUCCESS_MSG(),null,true);
    }

    public final static <T> Result<T> error(@NonNull String msg){
        return new Result<T>(ResultConf.getERROR_CODE(),msg,null,false);
    }

    public final static <T> Result<T> error(@NonNull Integer code,@NonNull String msg){
        return new Result<T>(code,msg,null,false);
    }
}
