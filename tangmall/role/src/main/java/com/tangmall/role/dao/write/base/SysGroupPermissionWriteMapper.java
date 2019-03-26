package com.tangmall.role.dao.write.base;

import com.tangmall.role.model.base.SysGroupPermission;
import com.tangmall.role.model.base.SysGroupPermissionExample;
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