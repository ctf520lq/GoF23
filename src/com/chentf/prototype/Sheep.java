package com.chentf.prototype;
/**
 * @ClassName:Sheep   
 * @Description: 测试浅拷贝 Client31997,英国的克隆羊，多利！
 * @author:陈腾飞
 * @date:2020年8月4日 下午4:36:05
 */

import java.util.Date;

public class Sheep implements Cloneable{

	private String sname;
	private Date birthday;
	
	//无参构造方法
	public Sheep() {}
	
	//有参构造方法
	public Sheep(String sname, Date birthday) {
		super();
		this.sname = sname;
		this.birthday = birthday;
	}
	
	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}


	public Date getBirthday() {
		return birthday;
	}


	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		//直接调用object对象的clone()方法！
		Object obj = super.clone();  
		return obj;
	}
	
	
}
