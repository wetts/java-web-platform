/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.wetts.base.config;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * 全局配置类
 * @author ThinkGem
 * @version 2014-06-25
 */
public class Global {

	/**
	 * 当前对象实例
	 */
	private static Global global = new Global();
	
	/**
	 * 保存全局属性值
	 */
	private static Map<String, String> map = Maps.newHashMap();
	
	/**
	 * 显示/隐藏
	 */
	public static final String SHOW = "1";
	public static final String HIDE = "0";

	/**
	 * 是/否
	 */
	public static final String YES = "1";
	public static final String NO = "0";
	
	/**
	 * 对/错
	 */
	public static final String TRUE = "true";
	public static final String FALSE = "false";
	
	/**
	 * 上传文件基础虚拟路径
	 */
	public static final String USERFILES_BASE_URL = "/userfiles/";
	
	/**
	 * redis 缓存key值  文章统计分析数据
	 */
	public static final String CT_ARTICLE_STATISTICS_DATA = "ct_article_statistics_data";
	/**
	 * redis 缓存key值  文章统计分析数据缓存保留时间
	 */
	public static final Integer  CT_ARTICLE_STATISTICS_DATA_CACHE_SECONDS = 24*3600;
	/**
	 * 获取当前对象实例
	 */
	public static Global getInstance() {
		return global;
	}
	
}
