package com.star.chen.system.vo;

import com.star.common.util.annotation.Excel;

import java.util.Date;

public class UserVo {

    @Excel(name = "员工编号",sort = 1)
    private Long empId;

    @Excel(name = "员工部门",sort = 2)
    private String empDept;

    @Excel(name = "出生年月",sort = 3,dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date empBirthday;

    @Excel(name="员工账号",sort = 4)
    private String empUsername;

    @Excel(name="员工姓名",sort = 5)
    private String empName;

    @Excel(name = "员工性别",sort = 6)
    private String empGender;

    @Excel(name = "员工邮箱",sort = 7)
    private String empEmail;

    @Excel(name = "员工电话",sort = 8)
    private String empTele;

    @Excel(name = "员工地址",sort = 9)
    private String empAddress;

    private String dateStart;
    private String dateEnd;
    private String deptId;

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getEmpDept() {
        return empDept;
    }

    public void setEmpDept(String empDept) {
        this.empDept = empDept;
    }

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public Date getEmpBirthday() {
        return empBirthday;
    }

    public void setEmpBirthday(Date empBirthday) {
        this.empBirthday = empBirthday;
    }

    public String getEmpUsername() {
        return empUsername;
    }

    public void setEmpUsername(String empUsername) {
        this.empUsername = empUsername;
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
}
