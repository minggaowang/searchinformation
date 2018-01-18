package cn.com.searchinformation.mapper;

import cn.com.searchinformation.model.SysRoleModel;
import cn.com.searchinformation.model.SysUserModel;

import java.util.List;

public interface SysUserByMySqlMapper {
    public SysUserModel findSysByUserName(String userName);

    public List<SysRoleModel> findRolesByUserName(String userName);

}
