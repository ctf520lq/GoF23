package com.chentf.singleton;
/**
 * @ClassName:SingletonDemo03   
 * @Description: 双重检查锁实现单例模式
 * @author:陈腾飞
 * @date:2020年8月4日 下午2:05:38
 */
public class SingletonDemo03 {

	private static SingletonDemo03 instance = null;
	
	private SingletonDemo03() {}
	
	private static SingletonDemo03 getInstance() {
		if(instance == null) {
			SingletonDemo03 sd;
			synchronized (SingletonDemo03.class) {
				sd = instance;
				if(sd == null) {
					synchronized (SingletonDemo03.class) {
						if(sd == null) {
							sd = new SingletonDemo03();
						}
					}
					instance = sd;
				}
			}
		}
		return instance;
	}
}
