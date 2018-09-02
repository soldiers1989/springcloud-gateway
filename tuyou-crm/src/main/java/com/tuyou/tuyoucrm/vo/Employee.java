package com.tuyou.tuyoucrm.vo;

import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.employee_id
     *
     * @mbg.generated
     */
    private Integer employeeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.uuid
     *
     * @mbg.generated
     */
    private String uuid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.login_name
     *
     * @mbg.generated
     */
    private String loginName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.password
     *
     * @mbg.generated
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.user_name
     *
     * @mbg.generated
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.user_image
     *
     * @mbg.generated
     */
    private String userImage;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.status
     *
     * @mbg.generated
     */
    private Byte status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.is_admin
     *
     * @mbg.generated
     */
    private Byte isAdmin;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.created_id
     *
     * @mbg.generated
     */
    private Integer createdId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.created_name
     *
     * @mbg.generated
     */
    private String createdName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.created_time
     *
     * @mbg.generated
     */
    private Date createdTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table employee
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.employee_id
     *
     * @return the value of employee.employee_id
     *
     * @mbg.generated
     */
    public Integer getEmployeeId() {
        return employeeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.employee_id
     *
     * @param employeeId the value for employee.employee_id
     *
     * @mbg.generated
     */
    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.uuid
     *
     * @return the value of employee.uuid
     *
     * @mbg.generated
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.uuid
     *
     * @param uuid the value for employee.uuid
     *
     * @mbg.generated
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.login_name
     *
     * @return the value of employee.login_name
     *
     * @mbg.generated
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.login_name
     *
     * @param loginName the value for employee.login_name
     *
     * @mbg.generated
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.password
     *
     * @return the value of employee.password
     *
     * @mbg.generated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.password
     *
     * @param password the value for employee.password
     *
     * @mbg.generated
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.user_name
     *
     * @return the value of employee.user_name
     *
     * @mbg.generated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.user_name
     *
     * @param userName the value for employee.user_name
     *
     * @mbg.generated
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.user_image
     *
     * @return the value of employee.user_image
     *
     * @mbg.generated
     */
    public String getUserImage() {
        return userImage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.user_image
     *
     * @param userImage the value for employee.user_image
     *
     * @mbg.generated
     */
    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.status
     *
     * @return the value of employee.status
     *
     * @mbg.generated
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.status
     *
     * @param status the value for employee.status
     *
     * @mbg.generated
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.is_admin
     *
     * @return the value of employee.is_admin
     *
     * @mbg.generated
     */
    public Byte getIsAdmin() {
        return isAdmin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.is_admin
     *
     * @param isAdmin the value for employee.is_admin
     *
     * @mbg.generated
     */
    public void setIsAdmin(Byte isAdmin) {
        this.isAdmin = isAdmin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.created_id
     *
     * @return the value of employee.created_id
     *
     * @mbg.generated
     */
    public Integer getCreatedId() {
        return createdId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.created_id
     *
     * @param createdId the value for employee.created_id
     *
     * @mbg.generated
     */
    public void setCreatedId(Integer createdId) {
        this.createdId = createdId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.created_name
     *
     * @return the value of employee.created_name
     *
     * @mbg.generated
     */
    public String getCreatedName() {
        return createdName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.created_name
     *
     * @param createdName the value for employee.created_name
     *
     * @mbg.generated
     */
    public void setCreatedName(String createdName) {
        this.createdName = createdName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.created_time
     *
     * @return the value of employee.created_time
     *
     * @mbg.generated
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.created_time
     *
     * @param createdTime the value for employee.created_time
     *
     * @mbg.generated
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", employeeId=").append(employeeId);
        sb.append(", uuid=").append(uuid);
        sb.append(", loginName=").append(loginName);
        sb.append(", password=").append(password);
        sb.append(", userName=").append(userName);
        sb.append(", userImage=").append(userImage);
        sb.append(", status=").append(status);
        sb.append(", isAdmin=").append(isAdmin);
        sb.append(", createdId=").append(createdId);
        sb.append(", createdName=").append(createdName);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}