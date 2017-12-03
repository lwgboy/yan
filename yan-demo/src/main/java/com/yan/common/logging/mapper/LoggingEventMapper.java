package com.yan.common.logging.mapper;

import com.yan.common.logging.model.LoggingEvent;
import com.yan.common.logging.model.LoggingEventExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LoggingEventMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logging_event
     *
     * @mbg.generated Wed Sep 13 14:33:21 CST 2017
     */
    long countByExample(LoggingEventExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logging_event
     *
     * @mbg.generated Wed Sep 13 14:33:21 CST 2017
     */
    int deleteByExample(LoggingEventExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logging_event
     *
     * @mbg.generated Wed Sep 13 14:33:21 CST 2017
     */
    int deleteByPrimaryKey(Long eventId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logging_event
     *
     * @mbg.generated Wed Sep 13 14:33:21 CST 2017
     */
    int insert(LoggingEvent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logging_event
     *
     * @mbg.generated Wed Sep 13 14:33:21 CST 2017
     */
    int insertSelective(LoggingEvent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logging_event
     *
     * @mbg.generated Wed Sep 13 14:33:21 CST 2017
     */
    List<LoggingEvent> selectByExampleWithBLOBs(LoggingEventExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logging_event
     *
     * @mbg.generated Wed Sep 13 14:33:21 CST 2017
     */
    List<LoggingEvent> selectByExample(LoggingEventExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logging_event
     *
     * @mbg.generated Wed Sep 13 14:33:21 CST 2017
     */
    LoggingEvent selectByPrimaryKey(Long eventId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logging_event
     *
     * @mbg.generated Wed Sep 13 14:33:21 CST 2017
     */
    int updateByExampleSelective(@Param("record") LoggingEvent record, @Param("example") LoggingEventExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logging_event
     *
     * @mbg.generated Wed Sep 13 14:33:21 CST 2017
     */
    int updateByExampleWithBLOBs(@Param("record") LoggingEvent record, @Param("example") LoggingEventExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logging_event
     *
     * @mbg.generated Wed Sep 13 14:33:21 CST 2017
     */
    int updateByExample(@Param("record") LoggingEvent record, @Param("example") LoggingEventExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logging_event
     *
     * @mbg.generated Wed Sep 13 14:33:21 CST 2017
     */
    int updateByPrimaryKeySelective(LoggingEvent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logging_event
     *
     * @mbg.generated Wed Sep 13 14:33:21 CST 2017
     */
    int updateByPrimaryKeyWithBLOBs(LoggingEvent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logging_event
     *
     * @mbg.generated Wed Sep 13 14:33:21 CST 2017
     */
    int updateByPrimaryKey(LoggingEvent record);
}