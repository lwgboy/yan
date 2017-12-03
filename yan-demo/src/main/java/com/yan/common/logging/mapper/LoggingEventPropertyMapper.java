package com.yan.common.logging.mapper;

import com.yan.common.logging.model.LoggingEventProperty;
import com.yan.common.logging.model.LoggingEventPropertyExample;
import com.yan.common.logging.model.LoggingEventPropertyKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LoggingEventPropertyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logging_event_property
     *
     * @mbg.generated Fri Sep 15 16:14:13 CST 2017
     */
    long countByExample(LoggingEventPropertyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logging_event_property
     *
     * @mbg.generated Fri Sep 15 16:14:13 CST 2017
     */
    int deleteByExample(LoggingEventPropertyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logging_event_property
     *
     * @mbg.generated Fri Sep 15 16:14:13 CST 2017
     */
    int deleteByPrimaryKey(LoggingEventPropertyKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logging_event_property
     *
     * @mbg.generated Fri Sep 15 16:14:13 CST 2017
     */
    int insert(LoggingEventProperty record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logging_event_property
     *
     * @mbg.generated Fri Sep 15 16:14:13 CST 2017
     */
    int insertSelective(LoggingEventProperty record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logging_event_property
     *
     * @mbg.generated Fri Sep 15 16:14:13 CST 2017
     */
    List<LoggingEventProperty> selectByExampleWithBLOBs(LoggingEventPropertyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logging_event_property
     *
     * @mbg.generated Fri Sep 15 16:14:13 CST 2017
     */
    List<LoggingEventProperty> selectByExample(LoggingEventPropertyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logging_event_property
     *
     * @mbg.generated Fri Sep 15 16:14:13 CST 2017
     */
    LoggingEventProperty selectByPrimaryKey(LoggingEventPropertyKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logging_event_property
     *
     * @mbg.generated Fri Sep 15 16:14:13 CST 2017
     */
    int updateByExampleSelective(@Param("record") LoggingEventProperty record, @Param("example") LoggingEventPropertyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logging_event_property
     *
     * @mbg.generated Fri Sep 15 16:14:13 CST 2017
     */
    int updateByExampleWithBLOBs(@Param("record") LoggingEventProperty record, @Param("example") LoggingEventPropertyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logging_event_property
     *
     * @mbg.generated Fri Sep 15 16:14:13 CST 2017
     */
    int updateByExample(@Param("record") LoggingEventProperty record, @Param("example") LoggingEventPropertyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logging_event_property
     *
     * @mbg.generated Fri Sep 15 16:14:13 CST 2017
     */
    int updateByPrimaryKeySelective(LoggingEventProperty record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logging_event_property
     *
     * @mbg.generated Fri Sep 15 16:14:13 CST 2017
     */
    int updateByPrimaryKeyWithBLOBs(LoggingEventProperty record);
}