package com.lu.test;

import com.lu.bean.Address;
import com.lu.bean.User;
import com.lu.config.Bean;
import com.lu.config.XmlConfig;
import com.lu.core.BeanFactory;
import com.lu.core.ClassPathXmlApplicationContext;

import java.util.Map;

public class Test {

    public static void main(String[] args) {
        testIOC();
        //testConfig();
    }
    /**
     * 测试IOC容器
     */
    private static void testIOC(){

        BeanFactory bf = new ClassPathXmlApplicationContext("/ApplicationContext.xml");

        User user = (User) bf.getBean("user");
        System.out.println(user);
        System.out.println("address hashcode:"+user.getAddress().hashCode());

        Address address = (Address) bf.getBean("address");
        System.out.println(address);
        System.out.println("address hashcode:"+address.hashCode());
    }
    /**
     * 测试读取配置文件
     */
    private static void testConfig(){
        Map<String, Bean> map = XmlConfig.getConfig("/ApplicationContext.xml");
        for (Map.Entry<String, Bean> entry : map.entrySet()) {
            System.out.println(entry.getKey()+"==="+entry.getValue());
        }
    }


}
