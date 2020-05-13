package com.hxt.util.list;

import java.util.List;
import java.util.Map;

/**
 * 封装返回list
 * 
 * @author hongxiaotong
 * @date 2020年5月13日 下午8:42:11
 */
public class ListUtils {

	// 判断list是否为空
	public List<?> emptyList(List<?> list) {
		if (list == null || list.size() <= 0) {
			return null;
		}
		return list;
	}

	// 判断map集合是否为空
	public Map<?, ?> emptyMap(Map<?, ?> map) {
		if (map == null || map.size() <= 0) {
			return null;
		}
		return map;
	}
}
