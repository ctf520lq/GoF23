package com.chentf.builder;

/**
 * @ClassName:AirShip   
 * @Description:宇宙飞船类
 * @author:陈腾飞
 * @date:2020年8月4日 下午4:01:19
 */
public class AirShip {

	private OrbitalModule orbitalModule;  //轨道舱
	private Engine engine; //发动机
	private EscapeTower escapeTower;  //逃逸塔
	
	public void launch(){
		System.out.println("发射！");
	}
	
	public OrbitalModule getOrbitalModule() {
		return orbitalModule;
	}
	public void setOrbitalModule(OrbitalModule orbitalModule) {
		this.orbitalModule = orbitalModule;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public EscapeTower getEscapeTower() {
		return escapeTower;
	}
	public void setEscapeTower(EscapeTower escapeTower) {
		this.escapeTower = escapeTower;
	}
	 
}

/**
 * @ClassName:OrbitalModule   
 * @Description: 轨道舱
 * @author:陈腾飞
 * @date:2020年8月4日 下午4:02:39
 */
class OrbitalModule{
	private String name;
	
	public OrbitalModule(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

/**
 * @ClassName:Engine   
 * @Description: 发动机
 * @author:陈腾飞
 * @date:2020年8月4日 下午4:03:34
 */
class Engine{
	private String name;
	
	public Engine(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

/**
 * @ClassName:EscapeTower   
 * @Description: 逃逸塔
 * @author:陈腾飞
 * @date:2020年8月4日 下午4:04:49
 */
class EscapeTower{
	private String name;
	
	public EscapeTower(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
