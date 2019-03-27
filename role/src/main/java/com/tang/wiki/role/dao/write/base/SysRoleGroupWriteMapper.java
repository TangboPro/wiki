package com.tang.wiki.role.dao.write.base;

import com.tang.wiki.role.model.base.SysRoleGroup;
import com.tang.wiki.role.model.base.SysRoleGroupExample;
import org.apache.ibatis.annotations.Param;

public interface SysRoleGroupWriteMapper {
    int deleteByExample(SysRoleGroupExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysRoleGroup record);

    int insertSelective(SysRoleGroup record);

    int updateByExampleSelective(@Param("record") SysRoleGroup record, @Param("example") SysRoleGroupExample example);

    int updateByExample(@Param("record") SysRoleGroup record, @Param("example") SysRoleGroupExample example);

    int updateByPrimaryKeySelective(SysRoleGroup record);

    int updateByPrimaryKey(SysRoleGroup record);
}