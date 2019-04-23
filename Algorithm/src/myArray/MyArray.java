package myArray;

import java.util.Arrays;

public class MyArray {
	private int[] arr;
	
	public MyArray(){
		arr = new int[0];
	}
	public int size(){
		return arr.length;
	}
	public void show(){
		System.out.println(Arrays.toString(arr));
	}
	
	public void add(int element){
		int[] newArr = new int[arr.length + 1];
		for (int i=0;i<arr.length;i++){
			newArr[i] = arr[i];
		}
		newArr[arr.length] = element;
		arr = newArr;
	}
	
	public void delete(int index){
		if(index<0 || index >arr.length-1){
			throw new RuntimeException("索引越界");
		}
		int[] newArr = new int[arr.length - 1];
		for (int i = 0; i<index; i++){
			newArr[i] = arr[i];
		}
		for (int i=index; i<arr.length-1;i++ ){
			newArr[i] = arr[i+1];
		}
		arr = newArr;
	}
	public int get(int index){
		if(index<0 || index >arr.length-1){
			throw new RuntimeException("索引越界");
		}
		return arr[index];
	}
	public void insert(int index , int element){
		if(index<0 || index >arr.length-1){
			throw new RuntimeException("索引越界");
		}
		int[] newArr = new int[arr.length + 1];
		for (int i = 0; i < newArr.length; i++) {
			if(i < index){
				newArr[i] = arr[i];
			}else if(i == index){
				newArr[i] = element;
			}else{
				newArr[i] = arr[i -1];
			}
		}
		arr = newArr;
	}
	public void exchange(int index, int element){
		if(index<0 || index >arr.length-1){
			throw new RuntimeException("索引越界");
		}
		int[] newArr = new int[arr.length];
		for (int i = 0; i < newArr.length; i++) {
			if(i == index){
				newArr[i] = element;
			}else{
				newArr[i] = arr[i];
			}
		}
		arr = newArr;
	}
}
