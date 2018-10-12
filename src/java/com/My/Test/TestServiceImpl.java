package com.My.Test;

import com.My.Spring.ZxfResource;

/**
 * @Description: 带有注解的服务
 * @ClassName: TestServiceImpl
 * @Project: MySpring
 * @Author: xvshu
 * @Date: 2015年2月28日
 */
public class TestServiceImpl {



	// 字段上的注解,可以配置name属性
	@ZxfResource
	public TestObject2 testObject2;

//	// set方法上的注解，带有name属性
//	@ZxfResource(name = "TestObject3")
//	public void setUserDao(TestObject3 TestObject3) {
//		this.TestObject3 = TestObject3;
//	}
//
//	// set方法上的注解，没有配置name属性
//	@ZxfResource
//	public void setUser1Dao(com.My.Test.TestObject1 TestObject1) {
//		this.TestObject1 = TestObject1;
//	}

	public void show() {
		
		testObject2.show2();

		System.out.println("调用了TestService方法........");
		
	}
}
