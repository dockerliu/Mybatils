package com.liu.dao;

import com.liu.pojo.SysAdmins;

import java.util.List;

public interface SysAdminsMapper {
    //获取全部用户
    List<SysAdmins> getSysAdminList();
    //根据ID查询用户
    SysAdmins getSysAdminById(int adminId);
    //Insert一个用户
    int addUser(SysAdmins admin);

    //修改用户
    int updateUser(SysAdmins admin);

    //删除用户
    int deleteUser(int adminId);
}
