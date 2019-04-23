package search;

public class SimpleSearch {
	public int simpleSearch(int[] arr, int element){
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == element){
				System.out.println("找到了，索引为" + i);
				return i;
			}
		}
		return -1;
	}
}
