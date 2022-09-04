// /**
//  * arraysum wise sum 
//  */
// public class arraysum {
// 	public static int  sum_of_array(int arr[], int length, int n) {
// 		//base case 
// 		if(length == 0) {
// 			return 0;
// 		}
// 		if(length == 1) {
// 			return arr[0];
// 		}
// 		int sum = 0;
// 		int ans = arr[n];
// 		sum = sum_of_array(arr, length - 1, n++); // recursive call
// 		return arr[0] + ans;
// 	};
// 	public static void main(String[] args) {
// 		int arr[] = {1, 2, 10, 4, 5, 6, 7, 8, 9};
// 		int n = 1;
// 		System.out.println(sum_of_array(arr, arr.length, n));
// 	}
	
// }