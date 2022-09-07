/* search element by using binary search */
/* space and time complexity = logn */
public class binarySearch {

	public static int search(int arr[], int target) {
		int start = 0; // index start 
		int end = arr.length - 1; // index end 
		while (start <= end) { // starting index not equals to end index tab tak array iterate 

			int mid = (start + end) / 2; // array midle element  

			if (arr[mid] == target) { // array  mid element equal to target 
				return mid; // after return present array number index
			} else if (arr[mid] > target) { // target also lower in array mid after 
				end = mid - 1; // ending point also midle - 1
			} else {
				start = mid + 1; // starting point also midle pointer + 1
			};

		};
		return -1; // no match condition after return -1 and not present element then return -1 
	};

	public static void main(String[] args) {
		int arr[] = { 1, 4, 5, 7, 8, 9, 10, 25 }; //simple array

		System.out.println(arr.length); // print array size
		int target = 0; // target mins find the array the element is present or not
		
		System.out.println("index is : " + search(arr, target)); // search function call
	}
}
