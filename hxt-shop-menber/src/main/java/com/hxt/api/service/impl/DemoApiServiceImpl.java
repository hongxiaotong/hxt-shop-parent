package com.hxt.api.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.hxt.api.service.DemoApiService;
import com.hxt.util.base.BaseApiService;
import com.hxt.util.redis.BaseRedisService;

@RestController
public class DemoApiServiceImpl extends BaseApiService implements DemoApiService {

	@Autowired
	private BaseRedisService baseRedisService;

	@Override
	public Map<String, Object> demo() {

		return setResultSuccess();
	}

	@Override
	public Map<String, Object> setKey(String key, String value) {
		baseRedisService.setString(key, value, null);
		return setResultSuccess(value);
	}

	@Override
	public Map<String, Object> getKey(String key) {
		String value = (String) baseRedisService.getKey(key);
		return setResultSuccess(value);
	}

}
