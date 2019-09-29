package com.viponetech.pojo;

import javax.persistence.*;
import java.util.Date;

@Table(name = "firm")
public class Firm {
    /**
     * 主键、编号、序号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * UUID
     */
    private String uuid;

    /**
     * 公司名称
     */
    private String name;

    /**
     * 公司简介
     */
    private String intro;

    /**
     * 类型（外部 or 内部）
     */
    private String type;

    /**
     * 业务
     */
    private String profession;

    /**
     * 状态
     */
    private Boolean status;

    /**
     * 创建时间
     */
    private Date created;

    /**
     * 修改时间
     */
    private Date modification;

    /**
     * 备注
     */
    private String remark;

    /**
     * 扩展字段
     */
    @Column(name = "ext_str")
    private String extStr;

    /**
     * 扩展字段
     */
    @Column(name = "ext_int")
    private Integer extInt;

    /**
     * 获取主键、编号、序号
     *
     * @return id - 主键、编号、序号
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键、编号、序号
     *
     * @param id 主键、编号、序号
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取UUID
     *
     * @return uuid - UUID
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * 设置UUID
     *
     * @param uuid UUID
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     * 获取公司名称
     *
     * @return name - 公司名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置公司名称
     *
     * @param name 公司名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取公司简介
     *
     * @return intro - 公司简介
     */
    public String getIntro() {
        return intro;
    }

    /**
     * 设置公司简介
     *
     * @param intro 公司简介
     */
    public void setIntro(String intro) {
        this.intro = intro;
    }

    /**
     * 获取类型（外部 or 内部）
     *
     * @return type - 类型（外部 or 内部）
     */
    public String getType() {
        return type;
    }

    /**
     * 设置类型（外部 or 内部）
     *
     * @param type 类型（外部 or 内部）
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取业务
     *
     * @return profession - 业务
     */
    public String getProfession() {
        return profession;
    }

    /**
     * 设置业务
     *
     * @param profession 业务
     */
    public void setProfession(String profession) {
        this.profession = profession;
    }

    /**
     * 获取状态
     *
     * @return status - 状态
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * 获取创建时间
     *
     * @return created - 创建时间
     */
    public Date getCreated() {
        return created;
    }

    /**
     * 设置创建时间
     *
     * @param created 创建时间
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * 获取修改时间
     *
     * @return modification - 修改时间
     */
    public Date getModification() {
        return modification;
    }

    /**
     * 设置修改时间
     *
     * @param modification 修改时间
     */
    public void setModification(Date modification) {
        this.modification = modification;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取扩展字段
     *
     * @return ext_str - 扩展字段
     */
    public String getExtStr() {
        return extStr;
    }

    /**
     * 设置扩展字段
     *
     * @param extStr 扩展字段
     */
    public void setExtStr(String extStr) {
        this.extStr = extStr;
    }

    /**
     * 获取扩展字段
     *
     * @return ext_int - 扩展字段
     */
    public Integer getExtInt() {
        return extInt;
    }

    /**
     * 设置扩展字段
     *
     * @param extInt 扩展字段
     */
    public void setExtInt(Integer extInt) {
        this.extInt = extInt;
    }
}