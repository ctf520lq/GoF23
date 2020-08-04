package com.chentf.prototype;

import java.util.Date;
/**
 * @ClassName:ClientTest01   
 * @Description: 测试原型模式(浅克隆)
 * @author:陈腾飞
 * @date:2020年8月4日 下午4:48:03
 */
public class ClientTest01 {

	public static void main(String[] args) throws Exception {
		Date date = new Date(123123123L);
//		SimpleDateFormat sf = new SimpleDateFormat("yyy-MM-ss HH:mm:ss");
//		String format = sf.format(date);
		
		Sheep sheep1 = new Sheep("少利",date);
		System.out.println(sheep1);
		System.out.println(sheep1.getSname());
		System.out.println(sheep1.getBirthday());
		
		//此处修改sheep1的时间
		date.setTime(678678678L);
		System.out.println("修改后的时间:"+sheep1.getBirthday());
		
		Sheep sheep2 = (Sheep) sheep1.clone();
		sheep2.setSname("多利");
		System.out.println(sheep2);
		System.out.println(sheep2.getSname());
		System.out.println(sheep2.getBirthday());
		
//		com.chentf.prototype.Sheep@15db9742
//		少利
//		Fri Jan 02 18:12:03 CST 1970
//		修改后的时间:Fri Jan 09 04:31:18 CST 1970
//		com.chentf.prototype.Sheep@5c647e05
//		多利
//		Fri Jan 09 04:31:18 CST 1970
		
		/**
		 * 结论:sheep2对象通过clone()方法浅拷贝自sheep1,但是sheep1中的时间属性修改后,对sheep2拷贝过来的时间还是有影响的.
		 */
		
	}
}
