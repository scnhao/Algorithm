package selectionSort;

public class SelectionSort {
/*	public static int findSmallest(int[] arr){
		int smallest = arr[0];
		int smallest_index = 0;
		for(int i = 0; i < arr.length; i++){
			if (arr[i] < smallest){
				smallest = arr[i];
				smallest_index = i;
			}
		}
		return smallest_index;
	}*/
	public static int[] selectionSort(int[] arr){
		for (int i = 0; i < arr.length - 1; i++) {
			int smallest_index = i;
			for (int j = smallest_index + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]){
					smallest_index = j;
				}
			}
			if(smallest_index != i){
				int temp = arr[smallest_index];
				arr[smallest_index] = arr[i];
				arr[i] = temp;
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		 int[] arr = {6,3,4,5,11,23,13,1};
		 int[] newArr = selectionSort(arr);
		 for (int i:newArr) {
			System.out.println(i);
		}
		 
	}

}
