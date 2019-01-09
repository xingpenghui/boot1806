package com.qfedu.boot1806.vo;

/**   
* Copyright: Copyright (c) 2018
* @ClassName: ResultVo.java
* @Description: 该类的功能描述
* @version: v1.0.0
* @author: feri
* @date: 2018年12月19日 上午11:39:52 
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2018年12月19日       feri           v1.0.0               修改原因
*/
public class ResultVo {
	private int code;
	private String msg;
	private Object data;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
	public static ResultVo setOK(Object data) {
		ResultVo rvo=new ResultVo();
		rvo.setCode(0);
		rvo.setMsg("OK");
		rvo.setData(data);
		return rvo;
	}
	public static ResultVo setERROR() {
		ResultVo rvo=new ResultVo();
		rvo.setCode(1);
		rvo.setMsg("ERROR");
		return rvo;
	}
	

}
