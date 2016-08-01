package com.wetts.base.pagehelper;

import java.util.List;

public interface CountryMapper {

    Country selectByPrimaryKey(Integer id);

    List<Country> selectByPage();
}