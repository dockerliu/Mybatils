package com.liu.dao;

import com.liu.pojo.SysAdmins;

import java.util.List;
import java.util.Map;

//表接口方法
public interface SysAdminsMapper {
    //获取全部用户
    List<SysAdmins> getSysAdminList();

    //根据ID查询用户
    SysAdmins getSysAdminById(int adminId);

    //根据ID查询用户Map
    SysAdmins getSysAdminById2(Map<String, Object> map);

    //根据名字模糊查询
    List<SysAdmins> getSysAdminLikeName(String value);

    //Insert一个用户
    int addUser(SysAdmins admin);

    //Insert一个用户
    int addUser2(Map<String, Object> map);

    //修改用户
    int updateUser(SysAdmins admin);

    //删除用户
    int deleteUser(int adminId);
}
