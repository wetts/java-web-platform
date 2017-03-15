/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.wetts.application.dao.sys;


import com.wetts.application.dao.base.TreeDao;
import com.wetts.application.entity.sys.Area;

import java.util.List;

/**
 * 区域DAO接口
 * @author ThinkGem
 * @version 2014-05-16
 */
public interface AreaDao extends TreeDao<Area> {

    List<Area> findAllProvinceAndCityList();
}
