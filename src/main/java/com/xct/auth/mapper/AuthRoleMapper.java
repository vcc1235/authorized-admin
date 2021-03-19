package com.xct.auth.mapper;

import com.xct.auth.entity.AuthRole;
import com.xct.auth.entity.AuthRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthRoleMapper {
    long countByExample(AuthRoleExample example);

    int deleteByExample(AuthRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AuthRole record);

    int insertSelective(AuthRole record);

    List<AuthRole> selectByExampleWithBLOBs(AuthRoleExample example);

    List<AuthRole> selectByExample(AuthRoleExample example);

    AuthRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AuthRole record, @Param("example") AuthRoleExample example);

    int updateByExampleWithBLOBs(@Param("record") AuthRole record, @Param("example") AuthRoleExample example);

    int updateByExample(@Param("record") AuthRole record, @Param("example") AuthRoleExample example);

    int updateByPrimaryKeySelective(AuthRole record);

    int updateByPrimaryKeyWithBLOBs(AuthRole record);

    int updateByPrimaryKey(AuthRole record);
}