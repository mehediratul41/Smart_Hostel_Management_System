/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database_project2;

/**
 *
 * @author SARK
 */
public class AdminInfo {
    private String userName;
    private String password;
    private String employeeId;
    private String adminType;

    public AdminInfo() {
    }

    public AdminInfo(String userName, String password, String employeeId, String adminType) {
        this.userName = userName;
        this.password = password;
        this.employeeId = employeeId;
        this.adminType = adminType;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getAdminType() {
        return adminType;
    }

    public void setAdminType(String adminType) {
        this.adminType = adminType;
    }
    
    
}
