package binarySearch;

public class BinarySearch {
	public static int binary_search(int[] list, int item){
		int low = 0;
		int high = list.length;
		while(low <= high){
			int mid = (low + high)/2;
			int guess = list[mid];
			if (guess == item){
				return mid;
			}else if(guess > item){
				high = mid - 1;
			}else {
				low = mid + 1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] list = {1,2,3,4,5,6,7,8,9,10};
		int item = 3;
		int i = binary_search(list, item);
		System.out.println(i);
	}
}
