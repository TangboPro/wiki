package com.tangmall.role.dao.write.base;

import com.tangmall.role.model.base.SysUserGroup;
import com.tangmall.role.model.base.SysUserGroupExample;
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