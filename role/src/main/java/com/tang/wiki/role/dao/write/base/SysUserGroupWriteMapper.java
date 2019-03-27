package com.tang.wiki.role.dao.write.base;

import com.tang.wiki.role.model.base.SysUserGroup;
import com.tang.wiki.role.model.base.SysUserGroupExample;
import org.apache.ibatis.annotations.Param;

public interface SysUserGroupWriteMapper {
    int deleteByExample(SysUserGroupExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysUserGroup record);

    int insertSelective(SysUserGroup record);

    int updateByExampleSelective(@Param("record") SysUserGroup record, @Param("example") SysUserGroupExample example);

    int updateByExample(@Param("record") SysUserGroup record, @Param("example") SysUserGroupExample example);

    int updateByPrimaryKeySelective(SysUserGroup record);

    int updateByPrimaryKey(SysUserGroup record);
}