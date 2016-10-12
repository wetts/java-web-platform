package com.wetts.base.pagehelper;

import com.wetts.base.pagehelper.ParentVideoDate;

public interface ParentVideoDateMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ParentVideoDate record);

    int insertSelective(ParentVideoDate record);

    ParentVideoDate selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ParentVideoDate record);

    int updateByPrimaryKey(ParentVideoDate record);
}