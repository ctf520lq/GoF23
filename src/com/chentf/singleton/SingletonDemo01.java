package com.chentf.singleton;
/**
 * @ClassName:SingletonDemo01   
 * @Description:测试饿汉式
 * @author:陈腾飞
 * @date:2020年8月4日 下午1:55:16
 */
public class SingletonDemo01 {

	//类初始化时，立即加载这个对象（没有延时加载的优势）。加载类时，天然的是线程安全的！
	private static SingletonDemo01 instance = new SingletonDemo01();
	
	//构造方法私有化
	private SingletonDemo01() {}
	
	//方法没有同步，调用效率高！
	public static SingletonDemo01 getInstance() {
		return instance;
	}
}
