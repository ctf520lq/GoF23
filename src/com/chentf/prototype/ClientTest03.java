package com.chentf.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * @ClassName:ClientTest03   
 * @Description: 原型模式(深复制,使用序列化和反序列化的方式实现深复制)
 * @author:陈腾飞
 * @date:2020年8月4日 下午4:59:09
 */
public class ClientTest03 {

	public static void main(String[] args) throws Exception {
		Date date = new Date(12312321331L);
		Sheep03 s1 = new Sheep03("少利",date);
		System.out.println(s1);
		System.out.println(s1.getSname());
		System.out.println(s1.getBirthday());

		
//		使用序列化和反序列化实现深复制
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream    oos = new ObjectOutputStream(bos);
		oos.writeObject(s1);
		byte[] bytes = bos.toByteArray();
		
		ByteArrayInputStream  bis = new ByteArrayInputStream(bytes);
		ObjectInputStream	  ois = new ObjectInputStream(bis);
		
		Sheep03 s2 = (Sheep03) ois.readObject();   //克隆好的对象！
		
		System.out.println("修改原型对象的属性值");  
		date.setTime(23432432423L);
		
		System.out.println(s1.getBirthday());
		
		s2.setSname("多利");
		System.out.println(s2);
		System.out.println(s2.getSname());
		System.out.println(s2.getBirthday());
	}
}
