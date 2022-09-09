public class CheckSortedArray {
	public static boolean sort(int arr[], int index) {
		//base case 
		if(index == arr.length - 1) {
			return true;
		}
		
		/* 
		//first method 
		if(arr[index] < arr[index + 1]) {
			return sort(arr, index + 1); // recursive call 
		}else {
			return false
		} */

		//second method
		if(arr[index] >= arr[index + 1]) {
			return false;
		};
		
		return sort(arr, index + 1); // recursive call
	};
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4};
		int index = 0; // find first index 
		System.out.println("ans is : " + sort(arr, index)); // call and ans print
	};
};
