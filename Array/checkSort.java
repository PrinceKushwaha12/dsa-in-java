public class checkSort {
	
	public static int sort(int arr[]) {
		// applying for loop 
		int ans = -1;
		for(int i = 0; i < arr.length - 1; i++) {

			if(arr[i] < arr[i + 1]) {
				ans = 1;
			}else if(arr[i] == arr[i + 1]) {
				ans = -1;
			}else {
				ans = -1;
			}

		};
		return ans;
	};
	public static void main(String[] args) {
		int arr[] = {1, 2, 2, 4}; // simple array 
		int ans = sort(arr); // function call 
		System.out.println("sorted or not : " + ans);
	};
};
