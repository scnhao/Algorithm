package myStack;

public class MyStackTest {
	public static void main(String[] args) {
		MyStack ms=new MyStack();
		ms.push(9);
	    ms.push(8);
	    ms.push(7);
	    ms.push(6); 
	    int pop=ms.pop();
        System.out.println("栈顶元素为:"+pop);
        System.out.println("此时的所要查看的栈顶元素为："+ms.peek());
        System.out.println(ms.isEmpty());
	}
	
    
}
