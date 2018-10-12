package com.My.Spring;

/**
 * @Description:Spring用到的类公共部分定义
 * @ClassName: BeanDefinition
 * @Project: MySpring
 * @Author: xvshu
 * @Date: 2015年2月28日
 */
public class BeanDefine {

	public String id;
	public String className;

	public BeanDefine(String id, String className) {
		this.id = id;
		this.className = className;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

}
