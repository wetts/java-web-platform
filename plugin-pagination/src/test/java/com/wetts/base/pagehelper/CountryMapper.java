package com.wetts.base.pagehelper;

import java.util.List;
import java.util.Map;

public interface CountryMapper {

    Country selectByPrimaryKey(Integer id);

    List<Country> selectByPage(Map map);
}