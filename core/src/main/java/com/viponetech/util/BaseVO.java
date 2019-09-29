package com.viponetech.util;

import lombok.Data;

import java.io.Serializable;

/**
 * @ProjectName developmentFrame
 * @ClassName BaseVO
 * @Description TODO
 * @Author Administrator
 * @Date 2019/9/29 15:46
 * @Version 1.0
 **/
@Data
public abstract class BaseVO implements Serializable {

    /**
     * 当前页码，默认为1
     */
    private String pageNum = "1";

    /**
     * 每页多少条，默认为10条
     */
    private String pageSize = "10";

    /**
     * 排序字段
     */
    private String orderField;

    /**
     * 排序方向，默认ASC
     */
    private String orderDirection = "ASC";

}
