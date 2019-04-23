package myStack;

public class MyStack {
	private int[] elements;
	public MyStack(){
		elements = new int[0];
	}
	public void push(int element){
		int[] newArr = new int[elements.length + 1];
		for (int i = 0; i < newArr.length - 1; i++) {
			newArr[i] = elements[i];
		}
		newArr[elements.length] = element;
		elements = newArr;
	}
	public int pop(){
		if(elements.length == 0){
			throw new RuntimeException("栈中没有元素");
		}
		int[] newArr = new int[elements.length - 1];
		for (int i = 0; i < newArr.length - 1; i++) {
			newArr[i] = elements[i];
		}
		int temp = elements[elements.length -1];
		elements = newArr;
		return temp;
	}
	public int peek(){
		if(elements.length == 0){
			throw new RuntimeException("栈中没有元素");
		}
		return elements[elements.length - 1];
	}
	public boolean isEmpty(){
		return elements.length == 0;
	}
}
