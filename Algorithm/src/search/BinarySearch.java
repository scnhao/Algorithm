package search;

public class BinarySearch {
	public int binarySearch(int[] arr, int element){
		int start = 0;
		int end = arr.length -1;
		int mid = (start + end)/2;
		while(start < end){
			if (element > arr[mid]){
				start = mid + 1;
			}else if (element < arr[mid]){
				end = mid -1;
			}else {
				System.out.println("找到了，索引为" + mid);
				return mid;
			}
			mid = (start + end)/2;
		}
		System.out.println("没有找到");
		return -1;
	}
}
