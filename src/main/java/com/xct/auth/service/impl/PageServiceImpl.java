package com.xct.auth.service.impl;

import com.xct.auth.entity.AuthPage;
import com.xct.auth.entity.AuthRole;
import com.xct.auth.entity.AuthRoleExample;
import com.xct.auth.mapper.AuthPageMapper;
import com.xct.auth.mapper.AuthRoleMapper;
import com.xct.auth.model.PermissionModel;
import com.xct.auth.service.IPageService;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;

@Service("PageServiceImpl")
public class PageServiceImpl implements IPageService {

    @Resource
    private AuthPageMapper pageMapper;
    @Resource
    private AuthRoleMapper permissionMapper;

    @Override
    public List<AuthPage> getAllPage(List<String> list) {
        return null;
    }

    @Override
    public AuthRole getPermissionList(Integer roleId) {
        AuthRoleExample permissionExample = new AuthRoleExample();
        permissionExample.createCriteria().andIdEqualTo(roleId);
        List<AuthRole> permissions = permissionMapper.selectByExampleWithBLOBs(permissionExample);
        if (CollectionUtils.isEmpty(permissions)){
            return null;
        }
        AuthRole authRole = permissions.get(0);
        PermissionModel permissionModel = (PermissionModel) authRole;
        permissionModel.reloadPermission();
        return permissionModel;
    }

    @Override
    public boolean addPage(AuthPage page) {
        return false;
    }

    @Override
    public boolean updatePage(Integer pageId, AuthPage page) {
        return false;
    }


}
