package com.chentf.singleton;
/**
 * @ClassName:SingletonDemo05   
 * @Description: 测试枚举式实现单例模式(没有延时加载)
 * @author:陈腾飞
 * @date:2020年8月4日 下午2:16:58
 */
public enum SingletonDemo05 {
	
	//定义一个枚举的元素，它就代表了Singleton的一个实例。
	INSTANCE;
	
	//单例可以有自己的操作
	public void singletonOperation() {
		//功能处理
	}
}
