package com.viponetech.base.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.viponetech.base.mapper.BaseMapper;
import com.viponetech.base.service.BaseService;
import com.viponetech.base.util.FiltrateExample;
import com.viponetech.util.Result;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * @ProjectName developmentFrame
 * @ClassName BaseServiceImpl
 * @Description TODO
 * @Author Administrator
 * @Date 2019/9/30 14:24
 * @Version 1.0
 **/
public abstract class BaseServiceImpl<T,S extends BaseMapper<T>> implements BaseService<T,S> {

    @Autowired
    @SuppressWarnings("all")
    @Getter
    private S baseMapper;

    /**
     * 获取当前表的所有数据
     * @return
     */
    @Override
    public Result<List<T>> selectAll() {
        return Result.success(baseMapper.selectAll());
    }

    /**
     * 分页获取表的数据
     * @param pageIndex 页码
     * @param pageSize 每页显示条数
     * @return
     */
    @Override
    public Result<PageInfo<T>> selectPage(Integer pageIndex, Integer pageSize) {
        PageHelper.startPage(pageIndex,pageSize);
        List<T> list=baseMapper.selectAll();
        return Result.success(new PageInfo<>(list));
    }

    /**
     * 重载：
     * 获取当前表的数据 根据条件获取 使用回调方式实现
     * Example 使用方式 示例：
     * Result result=firmService.selectAll(example -> {
     *             example.createCriteria().andEqualTo("id","1");
     *         });
     *         以上为查询id等于1的数据
     * @param filtrateExample 回调参数
     * @return
     */
    @Override
    public Result<List<T>> selectAll(FiltrateExample<T> filtrateExample) {
        //实例化 example 给定实体类 通过反射获取泛型实体类
        Example example=new Example(this.getTClass());
        //回调函数  给定example查询条件
        filtrateExample.filtrate(example);
        return Result.success(baseMapper.selectByExample(example));
    }

    /**
     * 重载：
     * 分页获取当前表的数据 根据条件获取 使用回调方式实现
     * Example 使用方式 示例
     * Result result=firmService.selectAll(1,1,example -> {
     *             example.createCriteria().andEqualTo("id","1");
     *         });
     *         以上为查询第一页中第一条数据 id为1的数据
     * @param pageIndex
     * @param pageSize
     * @param filtrateExample
     * @return
     */
    @Override
    public Result<PageInfo<T>> selectPage(Integer pageIndex, Integer pageSize, FiltrateExample<T> filtrateExample) {
        //实例化 example 给定实体类 通过反射获取泛型实体类
        Example example=new Example(this.getTClass());
        //回调函数  给定example查询条件
        filtrateExample.filtrate(example);
        //使用pageHelper实现分页
        PageHelper.startPage(pageIndex,pageSize);
        List<T> list=baseMapper.selectByExample(example);
        return Result.success(new PageInfo<>(list));
    }

    /**
     * 根据id查询数据
     * @param id 序号、编号、主键
     * @return
     */
    @Override
    public Result<T> selectById(Serializable id) {
        return Result.success(baseMapper.selectByPrimaryKey(id));
    }

    /**
     * 新增数据
     * @param t 表实体类
     * @return
     */
    @Override
    public Result insert(T t) {
        return judgeIfFail(baseMapper.insertSelective(t),"新增失败");
    }

    /**
     * 根据id删除表数据
     * @param id 序号、编号、主键
     * @return
     */
    @Override
    public Result deleteById(Serializable id) {
        return judgeIfFail(baseMapper.deleteByPrimaryKey(id),"通过id删除数据失败");
    }

    /**
     * 根据ids批量删除数据
     * @param ids 序号、主键、编号 通过","分割
     * @return
     */
    @Override
    public Result deleteByIds(String ids) {
        return judgeIfFail(baseMapper.deleteByIds(ids),"通过ids批量删除数据失败");
    }

    /**
     * 根据条件删除数据  通过回调实现
     * @param filtrateExample 回调参数
     * @return
     */
    @Override
    public Result deleteByExample(FiltrateExample filtrateExample) {
        Example example=new Example(this.getTClass());
        filtrateExample.filtrate(example);
        return judgeIfFail(baseMapper.deleteByExample(example),"根据条件删除数据失败");
    }

    /**
     * 根据id 修改数据
     * 给实体类id赋值即可通过id进行修改
     * @param t 需要修改的实体类
     * @return
     */
    @Override
    public Result updateById(T t) {
        return judgeIfFail(baseMapper.updateByPrimaryKeySelective(t),"根据id修改数据失败");
    }

    /**
     * 根据条件修改数据  通过回调实现
     * @param t 需要修改的实体类
     * @param filtrateExample 回调函数
     * @return
     */
    @Override
    public Result updateByExample(T t,FiltrateExample<T> filtrateExample) {
        Example example=new Example(this.getTClass());
        filtrateExample.filtrate(example);
        return judgeIfFail(baseMapper.updateByExampleSelective(t,example),"根据条件修改数据失败");
    }

    /**
     * 该方法为三元表达式 通过增删改返回值判断返回成功或失败 简化代码 增强代码可读性
     * @param i 新增、删除、修改返回值
     * @param errorMsg 错误信息
     * @return
     */
    private Result judgeIfFail(Integer i,String errorMsg){
        return i>0?Result.success():Result.error(errorMsg);
    }

    /**
     * 获取当前类的泛型 第一个泛型T
     * @return
     */
    private Class<?> getTClass(){
        //返回表示此 Class 所表示的实体（类、接口、基本类型或 void）的直接超类的 Type。
        ParameterizedType type = (ParameterizedType)this.getClass().getGenericSuperclass();
        //返回表示此类型实际类型参数的 Type 对象的数组(),赋值给this.classt
        return (Class)type.getActualTypeArguments()[0];
    }


}
