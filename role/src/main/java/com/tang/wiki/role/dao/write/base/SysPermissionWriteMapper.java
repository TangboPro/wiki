package com.tang.wiki.role.dao.write.base;

import com.tang.wiki.role.model.base.SysPermission;
import com.tang.wiki.role.model.base.SysPermissionExample;
import org.apache.ibatis.annotations.Param;

public interface SysPermissionWriteMapper {
    int deleteByExample(SysPermissionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysPermission record);

    int insertSelective(SysPermission record);

    int updateByExampleSelective(@Param("record") SysPermission record, @Param("example") SysPermissionExample example);

    int updateByExample(@Param("record") SysPermission record, @Param("example") SysPermissionExample example);

    int updateByPrimaryKeySelective(SysPermission record);

    int updateByPrimaryKey(SysPermission record);
}