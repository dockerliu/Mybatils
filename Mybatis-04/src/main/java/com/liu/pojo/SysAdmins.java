package com.liu.pojo;
import org.apache.ibatis.type.Alias;

//数据表实体实
@Alias("Admin")
public class SysAdmins {
    private int AdminId;
    private String AdminName;
    private String LoginPwd;
    private int StatusId;
    private int RoleId;

    public SysAdmins() {
    }

    public SysAdmins(int adminId, String adminName, String loginPwd, int statusId, int roleId) {
        AdminId = adminId;
        AdminName = adminName;
        LoginPwd = loginPwd;
        StatusId = statusId;
        RoleId = roleId;
    }

    public int getAdminId() {
        return AdminId;
    }

    public void setAdminId(int adminId) {
        AdminId = adminId;
    }

    public String getAdminName() {
        return AdminName;
    }

    public void setAdminName(String adminName) {
        AdminName = adminName;
    }

    public String getLoginPwd() {
        return LoginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        LoginPwd = loginPwd;
    }

    public int getStatusId() {
        return StatusId;
    }

    public void setStatusId(int statusId) {
        StatusId = statusId;
    }

    public int getRoleId() {
        return RoleId;
    }

    public void setRoleId(int roleId) {
        RoleId = roleId;
    }

    @Override
    public String toString() {
        return "SysAdmins{" +
                "AdminId=" + AdminId +
                ", AdminName='" + AdminName + '\'' +
                ", LoginPwd='" + LoginPwd + '\'' +
                ", StatusId=" + StatusId +
                ", RoleId=" + RoleId +
                '}';
    }
}
