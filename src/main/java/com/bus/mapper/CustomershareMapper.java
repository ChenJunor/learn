package com.bus.mapper;

import com.bus.entity.Customershare;
import com.bus.entity.CustomershareExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomershareMapper {
    int countByExample(CustomershareExample example);

    int deleteByExample(CustomershareExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Customershare record);

    int insertSelective(Customershare record);

    List<Customershare> selectByExample(CustomershareExample example);

    Customershare selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Customershare record, @Param("example") CustomershareExample example);

    int updateByExample(@Param("record") Customershare record, @Param("example") CustomershareExample example);

    int updateByPrimaryKeySelective(Customershare record);

    int updateByPrimaryKey(Customershare record);
}