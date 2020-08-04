package com.chentf.prototype;

import java.util.Date;

/**
 * @ClassName:Sheep2   
 * @Description: 测试深复制    //1997,英国的克隆羊，多利！
 * @author:陈腾飞
 * @date:2020年8月4日 下午4:50:37
 */
public class Sheep02 implements Cloneable{

	private String sname;
	private Date birthday;
	
	//无参构造方法
	public Sheep02() {}
	
	//有参构造方法
	public Sheep02(String sname, Date birthday) {
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
		
		//添加如下代码实现深复制(deep Clone)
		Sheep02 s = (Sheep02) obj;
		//把属性也进行克隆！
		s.birthday = (Date) this.birthday.clone();  
		
		return obj;
	}
	
}
