package com.chentf.prototype;
/**
 * @ClassName:Sheep   
 * @Description: 测试浅拷贝 Client31997,英国的克隆羊，多利！
 * @author:陈腾飞
 * @date:2020年8月4日 下午4:36:05
 */

import java.io.Serializable;
import java.util.Date;

public class Sheep03 implements Serializable{

	/**   
	 * @Fields serialVersionUID :  
	 */ 
	private static final long serialVersionUID = 1L;
	
	private String sname;
	private Date birthday;
	
	//无参构造方法
	public Sheep03() {}
	
	//有参构造方法
	public Sheep03(String sname, Date birthday) {
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

}
