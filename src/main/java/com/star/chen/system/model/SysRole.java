package com.star.chen.system.model;

import java.util.Date;

public class SysRole {
    private Long roleId;

    private String roleName;

    private Date roleTime;

    public SysRole(Long roleId, String roleName, Date roleTime) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.roleTime = roleTime;
    }

    public SysRole() {
        super();
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Date getRoleTime() {
        return roleTime;
    }

    public void setRoleTime(Date roleTime) {
        this.roleTime = roleTime;
    }
}