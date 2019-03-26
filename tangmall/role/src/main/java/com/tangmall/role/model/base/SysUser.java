package com.tangmall.role.model.base;

import com.alibaba.fastjson.annotation.JSONField;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.Serializable;
import java.util.Date;

public class SysUser implements Serializable {
    /**
     * 用户Id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * 用户名
     *
     * @mbg.generated
     */
    private String username;

    /**
     * 密码
     *
     * @mbg.generated
     */
    private String password;

    /**
     * 备注
     *
     * @mbg.generated
     */
    private String mark;

    /**
     * 最后一次登录时间
     *
     * @mbg.generated
     */
    private Date lastlogin;

    /**
     * 登录ip
     *
     * @mbg.generated
     */
    private String loginip;

    /**
     * 账号是否被锁定
     *
     * @mbg.generated
     */
    private Boolean locked;

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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @JSONField(serialize=false)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public Date getLastlogin() {
        return lastlogin;
    }

    public void setLastlogin(Date lastlogin) {
        this.lastlogin = lastlogin;
    }

    public String getLoginip() {
        return loginip;
    }

    public void setLoginip(String loginip) {
        this.loginip = loginip;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
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
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", mark=").append(mark);
        sb.append(", lastlogin=").append(lastlogin);
        sb.append(", loginip=").append(loginip);
        sb.append(", locked=").append(locked);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}