package com.hxt.util.redis;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

/**
 * redis基本操作
 * 
 * @author hongxiaotong
 * @date 2020年5月13日 下午9:14:56
 */
@Component
public class BaseRedisService {

	@Autowired
	private StringRedisTemplate stringRedisTemplate;

	// 存储
	public void setString(String key, Object data, Long timeout) {
		if (data instanceof String) {
			String value = (String) data;
			stringRedisTemplate.opsForValue().set(key, value);
		}
		if (timeout != null) {
			stringRedisTemplate.expire(key, timeout, TimeUnit.SECONDS);
		}
	}

	// 获取
	public Object getKey(String key) {
		return stringRedisTemplate.opsForValue().get(key);
	}

	// 删除
	public void delKey(String key) {
		stringRedisTemplate.delete(key);
	}
}
