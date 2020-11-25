package com.star.chen.system.model;

import java.util.Date;
import java.util.List;

public class SysUser {

    private Long empId;

    private String empUsername;

    private String empPwd;

    private String empSalt;

    private String empName;

    private String empGender;

    private String empEmail;

    private String empTele;

    private String empAddress;

    private Date empBirthday;

    private Long empDepuuid;

    //实体的岗位映射
    private Dept dept;
    //实体映射
    private List<SysRole> roles;

    public SysUser(Long empId, String empUsername, String empPwd, String empSalt, String empName, String empGender, String empEmail, String empTele, String empAddress, Date empBirthday, Long empDepuuid) {
        this.empId = empId;
        this.empUsername = empUsername;
        this.empPwd = empPwd;
        this.empSalt = empSalt;
        this.empName = empName;
        this.empGender = empGender;
        this.empEmail = empEmail;
        this.empTele = empTele;
        this.empAddress = empAddress;
        this.empBirthday = empBirthday;
        this.empDepuuid = empDepuuid;
    }

    public SysUser(Long empId, String empUsername, String empPwd, String empSalt, String empName, String empGender, String empEmail, String empTele, String empAddress, Date empBirthday, Long empDepuuid, Dept dept, List<SysRole> roles) {
        this.empId = empId;
        this.empUsername = empUsername;
        this.empPwd = empPwd;
        this.empSalt = empSalt;
        this.empName = empName;
        this.empGender = empGender;
        this.empEmail = empEmail;
        this.empTele = empTele;
        this.empAddress = empAddress;
        this.empBirthday = empBirthday;
        this.empDepuuid = empDepuuid;
        this.dept = dept;
        this.roles = roles;
    }

    public SysUser() {
        super();
    }

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public String getEmpUsername() {
        return empUsername;
    }

    public void setEmpUsername(String empUsername) {
        this.empUsername = empUsername;
    }

    public String getEmpPwd() {
        return empPwd;
    }

    public void setEmpPwd(String empPwd) {
        this.empPwd = empPwd;
    }

    public String getEmpSalt() {
        return empSalt;
    }

    public void setEmpSalt(String empSalt) {
        this.empSalt = empSalt;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpGender() {
        return empGender;
    }

    public void setEmpGender(String empGender) {
        this.empGender = empGender;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public String getEmpTele() {
        return empTele;
    }

    public void setEmpTele(String empTele) {
        this.empTele = empTele;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public Date getEmpBirthday() {
        return empBirthday;
    }

    public void setEmpBirthday(Date empBirthday) {
        this.empBirthday = empBirthday;
    }

    public Long getEmpDepuuid() {
        return empDepuuid;
    }

    public void setEmpDepuuid(Long empDepuuid) {
        this.empDepuuid = empDepuuid;
    }
}