package com.bus.mapper;

import com.bus.entity.Customervisit;
import com.bus.entity.CustomervisitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomervisitMapper {
    int countByExample(CustomervisitExample example);

    int deleteByExample(CustomervisitExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Customervisit record);

    int insertSelective(Customervisit record);

    List<Customervisit> selectByExample(CustomervisitExample example);

    Customervisit selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Customervisit record, @Param("example") CustomervisitExample example);

    int updateByExample(@Param("record") Customervisit record, @Param("example") CustomervisitExample example);

    int updateByPrimaryKeySelective(Customervisit record);

    int updateByPrimaryKey(Customervisit record);
}