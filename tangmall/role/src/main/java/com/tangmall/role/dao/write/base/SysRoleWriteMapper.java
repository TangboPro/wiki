package com.tangmall.role.dao.write.base;

import com.tangmall.role.model.base.SysRole;
import com.tangmall.role.model.base.SysRoleExample;
import org.apache.ibatis.annotations.Param;

public interface SysRoleWriteMapper {
    int deleteByExample(SysRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    int updateByExampleSelective(@Param("record") SysRole record, @Param("example") SysRoleExample example);

    int updateByExample(@Param("record") SysRole record, @Param("example") SysRoleExample example);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);
}