package com.liu.dao;

import com.liu.pojo.SysAdmins;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

//表接口方法
public interface SysAdminsMapper {
    //获取全部用户
    @Select("select * from libirarymanager.SysAdmins;")
    List<SysAdmins> getSysAdminList();

    //根据ID查询用户
    //方法有多个参数，必须加上“@Param”
    @Select("Select * from libirarymanager.SysAdmins where  adminId=#{adminId}")
    SysAdmins getSysAdminById(@Param("adminId") int adminId);


    //Insert一个用户
    @Insert("insert into libirarymanager.SysAdmins(adminId, adminName, loginPwd, statusId, roleId)  values (#{adminId}, #{adminName}, #{loginPwd}, #{statusId}, #{roleId});")
    int addUser(SysAdmins admin);

    //模糊查询
    List<SysAdmins> getSysAdminLikeName(String name);

    //修改用户
    @Update("update libirarymanager.SysAdmins set adminName=#{adminName}, loginPwd=#{loginPwd}, statusId=#{statusId}, roleId=#{roleId} where adminId = #{adminId};")
    int updateUser(SysAdmins admin);

    //删除用户
    @Delete("delete from libirarymanager.SysAdmins where AdminId = #{AdminId};")
    int deleteUser(int adminId);

    /*分页查询*/
    List<SysAdmins> getAdminByLimit(Map<String, Integer> map);

//    通过RowBounds分页查询
    List<SysAdmins> getAdminByRowBounds();
}
