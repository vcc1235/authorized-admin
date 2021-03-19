package com.xct.auth.entity;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class AuthRole implements Serializable {
    /**
     * id
     */
    @ApiModelProperty(value = "id")
    private Integer id;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    private Long createTime;

    /**
     * 角色名称
     */
    @ApiModelProperty(value = "角色名称")
    private String name;

    /**
     * 状态
     */
    @ApiModelProperty(value = "状态")
    private Boolean status;

    /**
     * 更新时间
     */
    @ApiModelProperty(value = "更新时间")
    private Long updateTime;

    /**
     * 权限表
     */
    @ApiModelProperty(value = "权限表")
    private String permission;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", createTime=").append(createTime);
        sb.append(", name=").append(name);
        sb.append(", status=").append(status);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", permission=").append(permission);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}