package com.viponetech.base;

import com.github.pagehelper.PageInfo;
import com.viponetech.base.service.BaseService;
import com.viponetech.util.Result;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ProjectName developmentFrame
 * @ClassName BaseController
 * @Description TODO
 * @Author Administrator
 * @Date 2019/9/30 17:38
 * @Version 1.0
 **/
public abstract class BaseController<T,S extends BaseService> {

    @Autowired
    @Getter
    private S baseService;

    @GetMapping("/selectAll")
    @ResponseBody
    public Result<T> selectAll(){
        return baseService.selectAll();
    }

    @RequestMapping("/selectPage")
    @ResponseBody
    public Result<PageInfo<T>> selectPage(@RequestParam("pageIndex") Integer pageIndex,@RequestParam("pageSize") Integer pageSize){
        return baseService.selectPage(pageIndex,pageSize);
    }

    @PostMapping("/insert")
    @ResponseBody
    public Result insert(){
        return null;
    }

}
