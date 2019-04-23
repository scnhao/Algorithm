package MyQueue;

public class MyQueue {
	private int[] elements;
	public MyQueue(){
		elements = new int[0]; 
	}
	public void add(int element){
		int[] newArr = new int[elements.length + 1];
		for (int i = 0; i < newArr.length - 1; i++) {
			newArr[i] = elements[i];
		}
		newArr[elements.length] = element;
		elements = newArr;
	}
	public int poll(){
		int[] newArr = new int[elements.length - 1];
		for (int i = 1; i < newArr.length - 1; i++) {
			newArr[i] = elements[i];
		}
		int temp = elements[0];
		elements = newArr;
		return temp;	
	}
	public boolean isEmpty(){
		return elements.length == 0;
	}
}
