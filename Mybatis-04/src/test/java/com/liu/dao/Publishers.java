package com.liu.dao;

import com.liu.pojo.Categories;
import com.liu.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

public class Publishers {
    public static void main(String[] args) {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        PublishersMapper mapper = sqlSession.getMapper(PublishersMapper.class);
        Categories categorie = mapper.getCategorie(1);
        System.out.println(categorie);
        sqlSession.close();

    }
}
