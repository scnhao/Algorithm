package quickSort;

public class QuickSort {
	public static void quicksort(int[] arr, int i ,int j){
		if(i > j){return;}
		int low = i;
		int high = j;
		int pivot = arr[i];
		while(low < high){
			while (arr[high] >= pivot && low < high ){
				high--;
			}
			while(arr[low] <= pivot && low < high ){
				low++;
			} 
			if(low < high){
				int t = arr[low];
				arr[low] = arr[high];
				arr[high] = t;
				}
			}
			arr[i] = arr[low];
			arr[low] = pivot;
			quicksort(arr, i, low-1);
			quicksort(arr, high+1, j);
	}
	public static void main(String[] args) {
		int[] arr = {2,4,7,1,3,11,10,5,0};
		quicksort(arr, 0, arr.length-1);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
