import java.util.*;
public class countPairs {
	public static void main(String args[]) { 
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("enter a size of array : ");
			int size = sc.nextInt(); // size of array 
			System.out.print("enter a pair of number : ");
			int pair = sc.nextInt(); // pairs of number
			int arr[] = new int[size];
			int count = 0;

			System.out.print("enter a array -> ");
			for(int i = 0; i < size; i++) {
				arr[i] = sc.nextInt();
			};

			for(int i = 0; i < size; i++) {
				for(int j = i + 1; j < size; j++) {
					if(arr[i] + arr[j] == pair) {
						count++;
					};
				};
			};

			System.out.println("pairs : " + count);
		}
	};
};