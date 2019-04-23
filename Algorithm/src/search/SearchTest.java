package search;

public class SearchTest {
	public static void main(String[] args) {
		SimpleSearch search = new SimpleSearch();
		BinarySearch bsearch = new BinarySearch();
		int arr[]=new int[] {1,2,3,4,5,6,7,8,9};
		int i = search.simpleSearch(arr, 4);
		int j = bsearch.binarySearch(arr, 20);
	}
}
