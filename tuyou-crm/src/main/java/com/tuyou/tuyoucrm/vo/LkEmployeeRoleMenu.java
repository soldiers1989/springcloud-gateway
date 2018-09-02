package com.tuyou.tuyoucrm.vo;

import java.io.Serializable;
import java.util.Date;

public class LkEmployeeRoleMenu implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lk_employee_role_menu.role_menu_id
     *
     * @mbg.generated
     */
    private Integer roleMenuId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lk_employee_role_menu.role_id
     *
     * @mbg.generated
     */
    private Integer roleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lk_employee_role_menu.menu_id
     *
     * @mbg.generated
     */
    private Integer menuId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lk_employee_role_menu.created_id
     *
     * @mbg.generated
     */
    private Integer createdId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lk_employee_role_menu.created_time
     *
     * @mbg.generated
     */
    private Date createdTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lk_employee_role_menu.created_name
     *
     * @mbg.generated
     */
    private String createdName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lk_employee_role_menu
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lk_employee_role_menu.role_menu_id
     *
     * @return the value of lk_employee_role_menu.role_menu_id
     *
     * @mbg.generated
     */
    public Integer getRoleMenuId() {
        return roleMenuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lk_employee_role_menu.role_menu_id
     *
     * @param roleMenuId the value for lk_employee_role_menu.role_menu_id
     *
     * @mbg.generated
     */
    public void setRoleMenuId(Integer roleMenuId) {
        this.roleMenuId = roleMenuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lk_employee_role_menu.role_id
     *
     * @return the value of lk_employee_role_menu.role_id
     *
     * @mbg.generated
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lk_employee_role_menu.role_id
     *
     * @param roleId the value for lk_employee_role_menu.role_id
     *
     * @mbg.generated
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lk_employee_role_menu.menu_id
     *
     * @return the value of lk_employee_role_menu.menu_id
     *
     * @mbg.generated
     */
    public Integer getMenuId() {
        return menuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lk_employee_role_menu.menu_id
     *
     * @param menuId the value for lk_employee_role_menu.menu_id
     *
     * @mbg.generated
     */
    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lk_employee_role_menu.created_id
     *
     * @return the value of lk_employee_role_menu.created_id
     *
     * @mbg.generated
     */
    public Integer getCreatedId() {
        return createdId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lk_employee_role_menu.created_id
     *
     * @param createdId the value for lk_employee_role_menu.created_id
     *
     * @mbg.generated
     */
    public void setCreatedId(Integer createdId) {
        this.createdId = createdId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lk_employee_role_menu.created_time
     *
     * @return the value of lk_employee_role_menu.created_time
     *
     * @mbg.generated
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lk_employee_role_menu.created_time
     *
     * @param createdTime the value for lk_employee_role_menu.created_time
     *
     * @mbg.generated
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lk_employee_role_menu.created_name
     *
     * @return the value of lk_employee_role_menu.created_name
     *
     * @mbg.generated
     */
    public String getCreatedName() {
        return createdName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lk_employee_role_menu.created_name
     *
     * @param createdName the value for lk_employee_role_menu.created_name
     *
     * @mbg.generated
     */
    public void setCreatedName(String createdName) {
        this.createdName = createdName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lk_employee_role_menu
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", roleMenuId=").append(roleMenuId);
        sb.append(", roleId=").append(roleId);
        sb.append(", menuId=").append(menuId);
        sb.append(", createdId=").append(createdId);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", createdName=").append(createdName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}