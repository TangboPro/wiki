package com.tang.wiki.role.dao.write.base;

import com.tang.wiki.role.model.base.SysRolePermission;
import com.tang.wiki.role.model.base.SysRolePermissionExample;
import org.apache.ibatis.annotations.Param;

public interface SysRolePermissionWriteMapper {
    int deleteByExample(SysRolePermissionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysRolePermission record);

    int insertSelective(SysRolePermission record);

    int updateByExampleSelective(@Param("record") SysRolePermission record, @Param("example") SysRolePermissionExample example);

    int updateByExample(@Param("record") SysRolePermission record, @Param("example") SysRolePermissionExample example);

    int updateByPrimaryKeySelective(SysRolePermission record);

    int updateByPrimaryKey(SysRolePermission record);
}