package com.chentf.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @ClassName:ClientTest02   
 * @Description:测试反射和反序列化破解单例模式
 * @author:陈腾飞
 * @date:2020年8月4日 下午2:29:42
 */
public class ClientTest02 {

	public static void main(String[] args) throws Exception {
		SingletonDemo06 s1 = SingletonDemo06.getInstance();
		SingletonDemo06 s2 = SingletonDemo06.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
		
		//通过反射的方式直接调用私有构造器
//		Class<SingletonDemo06> clazz = (Class<SingletonDemo06>) Class.forName("com.bjsxt.singleton.SingletonDemo6");
//		Constructor<SingletonDemo06> c = clazz.getDeclaredConstructor(null);
//		c.setAccessible(true);
//		SingletonDemo06  s3 = c.newInstance();
//		SingletonDemo06  s4 = c.newInstance();
//		System.out.println(s3);
//		System.out.println(s4);
		
		//通过反序列化的方式构造多个对象 
		FileOutputStream fo = new FileOutputStream("d:/a.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fo);
		oos.writeObject(s1);
		oos.close();
		fo.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:/a.txt"));
		SingletonDemo06 s3 =  (SingletonDemo06) ois.readObject();
		System.out.println(s3);
	}
}
