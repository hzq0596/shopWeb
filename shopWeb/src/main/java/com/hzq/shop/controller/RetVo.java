package com.hzq.shop.controller;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.hzq.shop.utils.Logger;
/**
 * 
 * @ClassName: RetVo 
 * @Description: TODO 返回值  公共类
 * @author: xiaoquan
 * @date: 2016年10月13日 下午10:32:01
 */
public class RetVo {
	

	
	protected final static Logger logger = Logger.getLogger(RetVo.class);
	protected Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
	
	//返回信息
	public String msg;
	public boolean isSuccess;
	public int pageSize;
	public int pageNum;
	public List<Object> list;
	public Object object;
	public Map<String, Object> map ;
	public Map<String, Object> getResultMap() {
		return resultMap;
	}
	public void setResultMap(Map<String, Object> resultMap) {
		this.resultMap = resultMap;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public boolean isSuccess() {
		return isSuccess;
	}
	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public List<Object> getList() {
		return list;
	}
	public void setList(List<Object> list) {
		this.list = list;
	}
	public Object getObject() {
		return object;
	}
	public void setObject(Object object) {
		this.object = object;
	}
	public Map<String, Object> getMap() {
		return map;
	}
	public void setMap(Map<String, Object> map) {
		this.map = map;
	}
	public static Logger getLogger() {
		return logger;
	}
	
	
}
