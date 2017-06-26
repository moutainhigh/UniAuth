package com.dianrong.common.uniauth.server.data.mapper;

import com.dianrong.common.uniauth.server.data.entity.ProfileDefinitionPath;
import com.dianrong.common.uniauth.server.data.entity.ProfileDefinitionPathExample;
import java.util.List;
import java.util.Set;

import org.apache.ibatis.annotations.Param;

public interface ProfileDefinitionPathMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profile_definition_path
     *
     * @mbggenerated Thu Jun 15 16:06:56 CST 2017
     */
    int countByExample(ProfileDefinitionPathExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profile_definition_path
     *
     * @mbggenerated Thu Jun 15 16:06:56 CST 2017
     */
    int deleteByExample(ProfileDefinitionPathExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profile_definition_path
     *
     * @mbggenerated Thu Jun 15 16:06:56 CST 2017
     */
    int insert(ProfileDefinitionPath record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profile_definition_path
     *
     * @mbggenerated Thu Jun 15 16:06:56 CST 2017
     */
    int insertSelective(ProfileDefinitionPath record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profile_definition_path
     *
     * @mbggenerated Thu Jun 15 16:06:56 CST 2017
     */
    List<ProfileDefinitionPath> selectByExample(ProfileDefinitionPathExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profile_definition_path
     *
     * @mbggenerated Thu Jun 15 16:06:56 CST 2017
     */
    int updateByExampleSelective(@Param("record") ProfileDefinitionPath record, @Param("example") ProfileDefinitionPathExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profile_definition_path
     *
     * @mbggenerated Thu Jun 15 16:06:56 CST 2017
     */
    int updateByExample(@Param("record") ProfileDefinitionPath record, @Param("example") ProfileDefinitionPathExample example);
    
    int relateProfileAndSubProfile(@Param("ancestorId")Long ancestorId, @Param("descendantIds")Set<Long> descendantIds);
    
    int isRelated(Set<Long> profileIds);
    
    List<ProfileDefinitionPath> getProfileTreeLinks(Long profileId);
}