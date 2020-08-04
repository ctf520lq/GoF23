package com.chentf.prototype;

import java.util.Date;
/**
 * @ClassName:ClientTest01   
 * @Description: 测试原型模式(浅克隆)
 * @author:陈腾飞
 * @date:2020年8月4日 下午4:48:03
 */
public class ClientTest02 {

	public static void main(String[] args) throws Exception {
		Date date = new Date(123123123L);
//		SimpleDateFormat sf = new SimpleDateFormat("yyy-MM-ss HH:mm:ss");
//		String format = sf.format(date);
		
		Sheep02 s1 = new Sheep02("少利",date);
		//实现深复制。s2对象的birthday是一个新对象！
		Sheep02 s2 = (Sheep02) s1.clone();
		
		System.out.println(s1);
		System.out.println(s1.getSname());
		System.out.println(s1.getBirthday());
		
		//此处修改sheep1的时间
		date.setTime(678678678L);
		System.out.println(s1.getBirthday());
		
		s2.setSname("多利");
		System.out.println(s2);
		System.out.println(s2.getSname());
		System.out.println(s2.getBirthday());
		
//		com.chentf.prototype.Sheep02@15db9742
//		少利
//		Fri Jan 02 18:12:03 CST 1970
//		Fri Jan 09 04:31:18 CST 1970
//		com.chentf.prototype.Sheep02@5c647e05
//		多利
//		Fri Jan 02 18:12:03 CST 1970
		
		/**
		 * 结论:sheep2对象通过clone()方法深拷贝自sheep1,无论时间怎么修改,sheep2不受影响.
		 */
		
	}
}
