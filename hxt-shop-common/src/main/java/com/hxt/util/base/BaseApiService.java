package com.hxt.util.base;

import java.util.HashMap;
import java.util.Map;

import com.hxt.util.constants.Constants;

/**
 * 封装响应信息
 * @author hongxiaotong
 * @date 2020年5月13日 下午8:49:43
 */
public class BaseApiService {

	//自定义返回
	public Map<String, Object> setResult(Integer code,String msg,Object data){
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put(Constants.HTTP_RES_CODE, code);
		resultMap.put(Constants.HTTP_RES_MSG, msg);
		if(data != null) {
			resultMap.put(Constants.HTTP_RES_DATA, data);
		}
		return resultMap;
	}
	//成功的返回，没有data
	public Map<String, Object> setResultSuccess(){
		return setResult(Constants.HTTP_RES_200,Constants.HTTP_RES_SUCCESS,null);
	}
	//成功的返回，有data
	public Map<String, Object> setResultSuccess(Object data){
		return setResult(Constants.HTTP_RES_200,Constants.HTTP_RES_SUCCESS,data);
	}
	//失败的返回
	public Map<String, Object> setResultError(String msg){
		return setResult(Constants.HTTP_RES_500,msg,null);
	}
	
}
