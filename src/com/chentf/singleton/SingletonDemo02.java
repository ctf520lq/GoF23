package com.chentf.singleton;
/**
 * @ClassName:SingletonDemo02   
 * @Description:测试懒汉式
 * @author:陈腾飞
 * @date:2020年8月4日 下午1:58:22
 */
public class SingletonDemo02 {

	//类初始化时，不初始化这个对象（延时加载，真正用的时候再创建）。
	private static SingletonDemo02 instance = null;
	
	//私有化构造器
	private SingletonDemo02() {}
	
	//方法同步，调用效率低！
	public static SingletonDemo02 getInstance() {
		if(instance == null) {
			instance = new SingletonDemo02(); 
		}
		return instance;
	}
}
