/* search element */

public class leanerSearch {
	
	public static int search(int arr[], int target) {
		//applying for loop to iterate arr index 0 till n
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == target) {   // check number present or not
				return i; // present number after return index of number
			};
		};
		return -1; // also not present element after return -1
	};
	
	public static void main(String[] args) {
		int arr[] = { 19, 4, 5, 7, 8, 9, 10,  25 }; // simple array
		System.out.println("array size is : " + arr.length); // print array length
		int target = 25; // target element to find this array 
		System.out.println("index is : " + search(arr, target)); // call search function
	}	
}
