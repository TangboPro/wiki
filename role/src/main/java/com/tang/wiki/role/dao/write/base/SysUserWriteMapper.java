package com.tang.wiki.role.dao.write.base;

import com.tang.wiki.role.model.base.SysUser;
import com.tang.wiki.role.model.base.SysUserExample;
import org.apache.ibatis.annotations.Param;

public interface SysUserWriteMapper {
    int deleteByExample(SysUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    int updateByExampleSelective(@Param("record") SysUser record, @Param("example") SysUserExample example);

    int updateByExample(@Param("record") SysUser record, @Param("example") SysUserExample example);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);
}