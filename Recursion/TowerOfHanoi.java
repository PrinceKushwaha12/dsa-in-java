/**
 * TowerOfHanoi
 */
public class TowerOfHanoi {
	public static void tower(int n, String surce, String helper, String Distination) {
		// base case 
		if(n == 1) { // num == 1 
			System.out.println("disk is " + n + " from " + surce + " to " + Distination);
			return;
		};

		tower(n - 1, surce, Distination, helper); // recursive call
		System.out.println("disk is " + n + " from " + surce + " to " + Distination);
		tower(n - 1, helper, surce, Distination); // recurcive call
	}
	public static void main(String[] args) {
		int num = 5; // tower leyer is 3
		//function call 
		tower(num, "S", "H", "D");
	}
}