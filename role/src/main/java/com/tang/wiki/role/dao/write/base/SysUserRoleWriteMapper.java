package com.tang.wiki.role.dao.write.base;

import com.tang.wiki.role.model.base.SysUserRole;
import com.tang.wiki.role.model.base.SysUserRoleExample;
import org.apache.ibatis.annotations.Param;

public interface SysUserRoleWriteMapper {
    int deleteByExample(SysUserRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysUserRole record);

    int insertSelective(SysUserRole record);

    int updateByExampleSelective(@Param("record") SysUserRole record, @Param("example") SysUserRoleExample example);

    int updateByExample(@Param("record") SysUserRole record, @Param("example") SysUserRoleExample example);

    int updateByPrimaryKeySelective(SysUserRole record);

    int updateByPrimaryKey(SysUserRole record);
}