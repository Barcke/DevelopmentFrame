package com.viponetech.base.service;

import com.github.pagehelper.PageInfo;
import com.viponetech.base.mapper.BaseMapper;
import com.viponetech.base.util.FiltrateExample;
import com.viponetech.util.Result;

import java.io.Serializable;
import java.util.List;

/**
 * @ProjectName developmentFrame
 * @ClassName BaseService
 * @Description TODO
 * @Author Administrator
 * @Date 2019/9/30 14:24
 * @Version 1.0
 **/
public interface BaseService<T,S extends BaseMapper<T>> {

    /**
     * 获取当前表的所有数据
     * @return
     */
    Result<List<T>> selectAll();

    /**
     * 分页获取表的数据
     * @param pageIndex 页码
     * @param pageSize 每页显示条数
     * @return
     */
    Result<PageInfo<T>> selectPage(Integer pageIndex,Integer pageSize);

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
    Result<List<T>> selectAll(FiltrateExample<T> filtrateExample);

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
    Result<PageInfo<T>> selectPage(Integer pageIndex, Integer pageSize, FiltrateExample<T> filtrateExample);

    /**
     * 根据id查询数据
     * @param id 序号、编号、主键
     * @return
     */
    Result<T> selectById(Serializable id);

    /**
     * 新增数据
     * @param t 表实体类
     * @return
     */
    Result insert(T t);

    /**
     * 根据id删除表数据
     * @param id 序号、编号、主键
     * @return
     */
    Result deleteById(Serializable id);

    /**
     * 根据ids批量删除数据
     * @param ids 序号、主键、编号 通过","分割
     * @return
     */
    Result deleteByIds(String ids);

    /**
     * 根据条件删除数据  通过回调实现
     * @param filtrateExample 回调参数
     * @return
     */
    Result deleteByExample(FiltrateExample<T> filtrateExample);

    /**
     * 根据id 修改数据
     * 给实体类id赋值即可通过id进行修改
     * @param t 需要修改的实体类
     * @return
     */
    Result updateById(T t);

    /**
     * 根据条件修改数据  通过回调实现
     * @param t 需要修改的实体类
     * @param filtrateExample 回调函数
     * @return
     */
    Result updateByExample(T t,FiltrateExample<T> filtrateExample);
}
