/* first and last index in elemet */
public class First_Last_Occurance {

	public static int firstcheck(int arr[], int size, int target) {
		int start = 0; // index store 0
		int end = size - 1; // index store last 
		int ans = -1;  // store index

		// find element left side 
		while(start <= end) {
			int mid = start + (end - start) / 2;  // find the mid index of array 
			if(arr[mid] == target) {
				ans = mid; // element is present after return index
				end = mid - 1;
			}else if(arr[mid] > target) {
				end = mid - 1; // target is small then last index is mid - 1
			}else {
				start = mid + 1; // target is big number then start is mid + 1
			};
		};

		return ans; // after all condition reach and return ans
	};

	public static int Lastcheck(int arr[], int size, int target) {

		int start = 0; // index store 0
		int end = size - 1; // index store last 
		int ans = -1;  // store index

		// search element is right side 
		while(start <= end) {
			int mid = start + (end - start) / 2;  // find the mid index of array 
			if(arr[mid] == target) {
				ans = mid; // element is present after return index
				start = mid + 1;
			}else if(arr[mid] > target) {
				end = mid - 1; // target is small then last index is mid - 1
			}else {
				start = mid + 1; // target is big number then start is mid + 1
			};
		};

		return ans; // after all condition reach and return ans
	};

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 4, 5, 5, 6, 6}; //simple array 
		int size = arr.length; // size of array 
		int target = 5; // target element 

		int LeftSideAns = firstcheck(arr, size, target);  //store first index 
		int RightSideAns = Lastcheck(arr, size, target); // store last index

		// print first and last index 
		System.out.println(LeftSideAns);
		System.out.println(RightSideAns);
	}
}
