package com.qfedu.boot1806.vo;

import java.util.List;

/**   
* Copyright: Copyright (c) 2018
* @ClassName: PageBeanVo.java
* @Description: 该类的功能描述
* @version: v1.0.0
* @author: feri
* @date: 2018年12月19日 上午11:43:10 
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2018年12月19日       feri           v1.0.0               修改原因
*/
public class PageBeanVo<T> {

	private int code;
	private int count;
	private String msg;
	private List<T> data;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public List<T> getData() {
		return data;
	}
	public void setData(List<T> data) {
		this.data = data;
	}
	
	public static <T> PageBeanVo setPage(int count,List<T> data) {
		PageBeanVo pvo=new PageBeanVo();
		pvo.setCode(0);
		pvo.setMsg("");
		pvo.setCount(count);
		pvo.setData(data);
		return pvo;
	}
	
}
