package com.tuyou.tuyoucrm.vo;

import java.io.Serializable;
import java.util.Date;

public class JoinWork implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column join_work.join_work_id
     *
     * @mbg.generated
     */
    private Integer joinWorkId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column join_work.station_id
     *
     * @mbg.generated
     */
    private Integer stationId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column join_work.join_work_num
     *
     * @mbg.generated
     */
    private Integer joinWorkNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column join_work.station_name
     *
     * @mbg.generated
     */
    private String stationName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column join_work.created_id
     *
     * @mbg.generated
     */
    private Integer createdId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column join_work.created_name
     *
     * @mbg.generated
     */
    private String createdName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column join_work.created_time
     *
     * @mbg.generated
     */
    private Date createdTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table join_work
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column join_work.join_work_id
     *
     * @return the value of join_work.join_work_id
     *
     * @mbg.generated
     */
    public Integer getJoinWorkId() {
        return joinWorkId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column join_work.join_work_id
     *
     * @param joinWorkId the value for join_work.join_work_id
     *
     * @mbg.generated
     */
    public void setJoinWorkId(Integer joinWorkId) {
        this.joinWorkId = joinWorkId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column join_work.station_id
     *
     * @return the value of join_work.station_id
     *
     * @mbg.generated
     */
    public Integer getStationId() {
        return stationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column join_work.station_id
     *
     * @param stationId the value for join_work.station_id
     *
     * @mbg.generated
     */
    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column join_work.join_work_num
     *
     * @return the value of join_work.join_work_num
     *
     * @mbg.generated
     */
    public Integer getJoinWorkNum() {
        return joinWorkNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column join_work.join_work_num
     *
     * @param joinWorkNum the value for join_work.join_work_num
     *
     * @mbg.generated
     */
    public void setJoinWorkNum(Integer joinWorkNum) {
        this.joinWorkNum = joinWorkNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column join_work.station_name
     *
     * @return the value of join_work.station_name
     *
     * @mbg.generated
     */
    public String getStationName() {
        return stationName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column join_work.station_name
     *
     * @param stationName the value for join_work.station_name
     *
     * @mbg.generated
     */
    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column join_work.created_id
     *
     * @return the value of join_work.created_id
     *
     * @mbg.generated
     */
    public Integer getCreatedId() {
        return createdId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column join_work.created_id
     *
     * @param createdId the value for join_work.created_id
     *
     * @mbg.generated
     */
    public void setCreatedId(Integer createdId) {
        this.createdId = createdId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column join_work.created_name
     *
     * @return the value of join_work.created_name
     *
     * @mbg.generated
     */
    public String getCreatedName() {
        return createdName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column join_work.created_name
     *
     * @param createdName the value for join_work.created_name
     *
     * @mbg.generated
     */
    public void setCreatedName(String createdName) {
        this.createdName = createdName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column join_work.created_time
     *
     * @return the value of join_work.created_time
     *
     * @mbg.generated
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column join_work.created_time
     *
     * @param createdTime the value for join_work.created_time
     *
     * @mbg.generated
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table join_work
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", joinWorkId=").append(joinWorkId);
        sb.append(", stationId=").append(stationId);
        sb.append(", joinWorkNum=").append(joinWorkNum);
        sb.append(", stationName=").append(stationName);
        sb.append(", createdId=").append(createdId);
        sb.append(", createdName=").append(createdName);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}