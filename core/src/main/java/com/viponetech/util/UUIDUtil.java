package com.viponetech.util;

/**
 * @ProjectName developmentFrame
 * @ClassName UUID
 * @Description TODO
 * @Author Administrator
 * @Date 2019/9/29 15:43
 * @Version 1.0
 **/
public final class UUIDUtil {

    private UUIDUtil() {
    }

    /**
     * 返回随机32位UUID
     *
     * @return
     */
    public final static String uuid() {
        return java.util.UUID.randomUUID().toString().replaceAll("-", "");
    }
}
