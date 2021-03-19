package com.xct.auth.service;

import com.xct.auth.entity.AuthPage;
import com.xct.auth.entity.AuthRole;

import java.util.List;

public interface IPageService {

    /**
    * desc: 根据权限获取页面信息
    * date: 2021/3/19
    */
    public List<AuthPage> getAllPage(List<String> list);

    /**
    * desc: 根据角色获取权限
    * date: 2021/3/19
    */
    public AuthRole getPermissionList(Integer roleId);

    /**
    * desc: 添加页面
    * date: 2021/3/19
    */
    public boolean addPage(AuthPage page);

    /**
    * desc: 更新页面
    * date: 2021/3/19
    */
    public boolean updatePage(Integer pageId, AuthPage page);

}
