package com.tangmall.role.dao.write;

import com.tangmall.role.model.base.SysUserPermission;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MySysUserPermissionWriteMapper {
    public int insertBatch(@Param("list") List<SysUserPermission> list);
}
