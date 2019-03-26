package com.tangmall.role.model.base;

import java.io.Serializable;
import java.util.Date;

public class SysUserRole implements Serializable {
    /**
     * 主键id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * 组id
     *
     * @mbg.generated
     */
    private Integer userId;

    /**
     * 用户id
     *
     * @mbg.generated
     */
    private Integer roleId;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", roleId=").append(roleId);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}