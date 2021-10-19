package com.liu.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import com.liu.pojo.Categories;

public interface PublishersMapper {

    @Select("Select * from Publishers where PublisherId=#{PublisherId}")
    Categories getCategorie(@Param("PublisherId") int id);
}
