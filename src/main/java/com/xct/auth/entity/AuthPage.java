package com.xct.auth.entity;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class AuthPage implements Serializable {
    /**
     * id
     */
    @ApiModelProperty(value = "id")
    private Integer id;

    /**
     * authority
     */
    @ApiModelProperty(value = "authority")
    private String authority;

    /**
     * component
     */
    @ApiModelProperty(value = "component")
    private String component;

    /**
     * create_time
     */
    @ApiModelProperty(value = "create_time")
    private Long createTime;

    /**
     * icon
     */
    @ApiModelProperty(value = "icon")
    private String icon;

    /**
     * keep_alive
     */
    @ApiModelProperty(value = "keep_alive")
    private Boolean keepAlive;

    /**
     * label
     */
    @ApiModelProperty(value = "label")
    private String label;

    /**
     * name
     */
    @ApiModelProperty(value = "name")
    private String name;

    /**
     * parentId
     */
    @ApiModelProperty(value = "parentId")
    private Integer parentId;

    /**
     * path
     */
    @ApiModelProperty(value = "path")
    private String path;

    /**
     * permission
     */
    @ApiModelProperty(value = "permission")
    private String permission;

    /**
     * redirect
     */
    @ApiModelProperty(value = "redirect")
    private String redirect;

    /**
     * sort
     */
    @ApiModelProperty(value = "sort")
    private String sort;

    /**
     * spread
     */
    @ApiModelProperty(value = "spread")
    private String spread;

    /**
     * type
     */
    @ApiModelProperty(value = "type")
    private String type;

    /**
     * update_time
     */
    @ApiModelProperty(value = "update_time")
    private Long updateTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Boolean getKeepAlive() {
        return keepAlive;
    }

    public void setKeepAlive(Boolean keepAlive) {
        this.keepAlive = keepAlive;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public String getRedirect() {
        return redirect;
    }

    public void setRedirect(String redirect) {
        this.redirect = redirect;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getSpread() {
        return spread;
    }

    public void setSpread(String spread) {
        this.spread = spread;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", authority=").append(authority);
        sb.append(", component=").append(component);
        sb.append(", createTime=").append(createTime);
        sb.append(", icon=").append(icon);
        sb.append(", keepAlive=").append(keepAlive);
        sb.append(", label=").append(label);
        sb.append(", name=").append(name);
        sb.append(", parentId=").append(parentId);
        sb.append(", path=").append(path);
        sb.append(", permission=").append(permission);
        sb.append(", redirect=").append(redirect);
        sb.append(", sort=").append(sort);
        sb.append(", spread=").append(spread);
        sb.append(", type=").append(type);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}