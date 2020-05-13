package com.hxt.api.service;
/**
 * 测试springcloud项目
 * 测试BaseApiService和BaseRedisService工具类
 * @author hongxiaotong
 * @date 2020年5月13日 下午10:03:50
 */

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/demo")
public interface DemoApiService {

	@GetMapping("/demo")
	Map<String, Object> demo();

	@GetMapping("/setkey")
	Map<String, Object> setKey(String key, String value);

	@GetMapping("/getkey")
	Map<String, Object> getKey(String key);
}
