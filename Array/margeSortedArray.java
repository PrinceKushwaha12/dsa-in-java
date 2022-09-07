public class margeSortedArray {
	
	public static void mergeSort(int arr1[], int arr2[], int arr3[], int sizeOfArr1, int sizeOfArr2) {
		int i = 0; // starting index array one 
		int j = 0; // starting index array two 
		int k = 0; // starting index array three 

		//while loop run and assing value first and second array in third
		while(i < sizeOfArr1 && j < sizeOfArr2) {
			
			if(arr1[i] < arr2[j]) {
				arr3[k] = arr1[i]; // first array value assign the third array 
				i++; // next index 
				k++; // next index 
			}else {
				arr3[k] = arr2[j]; // second array value assign the third array 
				j++; // next index
				k++; // next index
			}; 
		};

		// first array length is big after assign the value arr3
		while(i < sizeOfArr1) {
			arr3[k] = arr1[i]; // first array value assign the third array 
			k++; // next index
			i++; // next index 
		};

		// second array length is big after assign the value arr3
		while(j < sizeOfArr2) {
			arr3[k] = arr2[j]; // second array value assign the third array 
			k++;
			j++;
		};
	};

	public static void print(int arr3[], int sizeOfArr3) {
		for(int i = 0; i < sizeOfArr3; i++) {
			System.out.print(arr3[i] + " "); // print  array three
		}System.out.println();
	};

	public static void main(String[] args) {
		int arr1[] = {1, 4, 6, 7}; // first array 
		int arr2[] = {8, 9, 10, 11}; // second array 

		int sizeOfArr1 = arr1.length; // first array size 
		int sizeOfArr2 = arr2.length; // second array size
		int sizeOfArr3 = sizeOfArr1 + sizeOfArr2; // after added first and second array and define third array size
		int arr3[] = new int[sizeOfArr3]; // third array

		mergeSort(arr1, arr2, arr3, sizeOfArr1, sizeOfArr2); // call mergeSort function
		
		print(arr3, sizeOfArr3);
	}
}
