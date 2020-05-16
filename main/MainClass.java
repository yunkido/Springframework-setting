package kr.co.softcampus.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softcampus.beans.HelloWorld;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// beans.xml �� �ε��Ѵ�.
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softcampus/config/beans.xml");
		
		// xml �� ������ bean ��ü�� �ּҰ��� �����´�.
		HelloWorld hello1 = (HelloWorld)ctx.getBean("hello");
		callMethod(hello1);
		
		ctx.close();

	}
	
	public static void callMethod(HelloWorld hello) {
		hello.sayHello();
	}

}
