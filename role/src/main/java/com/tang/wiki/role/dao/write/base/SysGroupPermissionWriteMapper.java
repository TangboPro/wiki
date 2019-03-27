package com.tang.wiki.role.dao.write.base;

import com.tang.wiki.role.model.base.SysGroupPermission;
import com.tang.wiki.role.model.base.SysGroupPermissionExample;
import org.apache.ibatis.annotations.Param;

public interface SysGroupPermissionWriteMapper {
    int deleteByExample(SysGroupPermissionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysGroupPermission record);

    int insertSelective(SysGroupPermission record);

    int updateByExampleSelective(@Param("record") SysGroupPermission record, @Param("example") SysGroupPermissionExample example);

    int updateByExample(@Param("record") SysGroupPermission record, @Param("example") SysGroupPermissionExample example);

    int updateByPrimaryKeySelective(SysGroupPermission record);

    int updateByPrimaryKey(SysGroupPermission record);
}