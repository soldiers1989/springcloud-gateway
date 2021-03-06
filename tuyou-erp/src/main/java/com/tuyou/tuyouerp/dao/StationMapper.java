package com.tuyou.tuyouerp.dao;

import com.xdjk.model.erp.Station;
import com.xdjk.model.erp.StationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface StationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table station
     *
     * @mbg.generated
     */
    long countByExample(StationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table station
     *
     * @mbg.generated
     */
    int deleteByExample(StationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table station
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer stationId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table station
     *
     * @mbg.generated
     */
    int insert(Station record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table station
     *
     * @mbg.generated
     */
    int insertSelective(Station record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table station
     *
     * @mbg.generated
     */
    List<Station> selectByExampleWithRowbounds(StationExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table station
     *
     * @mbg.generated
     */
    List<Station> selectByExample(StationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table station
     *
     * @mbg.generated
     */
    Station selectByPrimaryKey(Integer stationId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table station
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Station record, @Param("example") StationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table station
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Station record, @Param("example") StationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table station
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Station record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table station
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Station record);
}