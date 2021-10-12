package com.liu.dao;


import com.liu.pojo.SysAdmins;
import com.liu.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;


import java.util.List;


public class SysAdminDaoTest {
    //查询所有用户
    @Test
    public void test() {
        /* 获取sqlSession对象 */
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        /*sqlSession执行SQL语句  方式一：getMapper*/
        SysAdminsMapper sysAdminsMapper = sqlSession.getMapper(SysAdminsMapper.class);
        List<SysAdmins> sysAdminsList = sysAdminsMapper.getSysAdminList();

        /* 遍历用户 */
        for (SysAdmins admin : sysAdminsList) {
            System.out.println(admin);
        }
        /* 关闭SqlSession */
        sqlSession.close();
    }

    //根据ID查询指定用户
    @Test
    public void getAdminById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        SysAdminsMapper adminsMapper = sqlSession.getMapper(SysAdminsMapper.class);

        SysAdmins admin = adminsMapper.getSysAdminById(1000);
        System.out.println(admin);
        sqlSession.close();
    }

    //根据名字模糊查询
    @Test
    public  void getSysAdminLikeName(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        SysAdminsMapper mapper = sqlSession.getMapper(SysAdminsMapper.class);
        List<SysAdmins> admins = mapper.getSysAdminLikeName("%%");
        for (SysAdmins admin: admins){
            System.out.println(admin);
        }
        sqlSession.close();
    }


    //Insert一个用户
    @Test
    public void addUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        SysAdminsMapper adminMapper = sqlSession.getMapper(SysAdminsMapper.class);
        int res = adminMapper.addUser(new SysAdmins(1003, "Andy Liu", "1234", 1, 1));
        if (res > 0) {
            System.out.println("插入成功！");
        }
        //**提交事务
        sqlSession.commit();

        sqlSession.close();

    }



    //updateUser
    @Test
    public void updateUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        SysAdminsMapper mapper = sqlSession.getMapper(SysAdminsMapper.class);
        int res = mapper.updateUser(new SysAdmins(1003, "刘生", "123123", 1, 1));
        if (res > 0) {
            System.out.println("修改成功！");
        }
        sqlSession.commit();
        sqlSession.close();

    }

    //DeleteUser
    @Test
    public void deleteUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        SysAdminsMapper mapper = sqlSession.getMapper(SysAdminsMapper.class);
        int res = mapper.deleteUser(1003);
        if (res > 0) System.out.println("删除用户成功！");
        sqlSession.commit();
        sqlSession.close();
    }
}
