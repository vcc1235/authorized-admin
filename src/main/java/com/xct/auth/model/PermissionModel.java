package com.xct.auth.model;

import com.alibaba.fastjson.JSON;
import com.xct.auth.entity.AuthRole;

import java.util.ArrayList;
import java.util.List;

public class PermissionModel extends AuthRole {

    private List<String> permissionList;

    public List<String> getPermissionList() {
        return permissionList;
    }

    public void reloadPermission(){
        try {
            this.permissionList = JSON.parseArray(this.getPermission(), String.class);
        }catch (Exception e){
            this.permissionList = new ArrayList<>();
        }
    }
}
