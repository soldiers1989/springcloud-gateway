package com.tuyou.tuyouerp.dao;

import com.xdjk.model.erp.Organization;
import com.xdjk.model.erp.OrganizationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface OrganizationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table organization
     *
     * @mbg.generated
     */
    long countByExample(OrganizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table organization
     *
     * @mbg.generated
     */
    int deleteByExample(OrganizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table organization
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer organizationId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table organization
     *
     * @mbg.generated
     */
    int insert(Organization record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table organization
     *
     * @mbg.generated
     */
    int insertSelective(Organization record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table organization
     *
     * @mbg.generated
     */
    List<Organization> selectByExampleWithRowbounds(OrganizationExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table organization
     *
     * @mbg.generated
     */
    List<Organization> selectByExample(OrganizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table organization
     *
     * @mbg.generated
     */
    Organization selectByPrimaryKey(Integer organizationId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table organization
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Organization record, @Param("example") OrganizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table organization
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Organization record, @Param("example") OrganizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table organization
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Organization record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table organization
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Organization record);
}