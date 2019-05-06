package test2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler{
	private Object subject;    
	//构造方法，给我们要代理的真实对象赋初值
	public DynamicProxy(Object subject){
		this.subject = subject;
	}
	@Override
	public Object invoke(Object object, Method method, Object[] args) 
			throws Throwable {
		System.out.println("before rent house");
		System.out.println("Method:" + method);
		method.invoke(subject, args);
		System.out.println("after rent house");
		return null;
	}
	
}
