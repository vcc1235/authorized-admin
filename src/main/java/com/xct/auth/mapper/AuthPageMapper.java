package com.xct.auth.mapper;

import com.xct.auth.entity.AuthPage;
import com.xct.auth.entity.AuthPageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthPageMapper {
    long countByExample(AuthPageExample example);

    int deleteByExample(AuthPageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AuthPage record);

    int insertSelective(AuthPage record);

    List<AuthPage> selectByExample(AuthPageExample example);

    AuthPage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AuthPage record, @Param("example") AuthPageExample example);

    int updateByExample(@Param("record") AuthPage record, @Param("example") AuthPageExample example);

    int updateByPrimaryKeySelective(AuthPage record);

    int updateByPrimaryKey(AuthPage record);
}