#include <bits/stdc++.h>
using namespace std;
int main() {
	int arr[] = {1, 3, 2, 4, 5};
	int n = 5;
	for(int i = 0; i < n; i++) {
		int smalest = i;
		for(int j = i + 1; j < n; j++) {
			if(arr[smalest] > arr[j]) {
				smalest = j;
			};
		int temp = arr[smalest];
		arr[smalest] = arr[i]; 
		arr[i] = temp;
		};
	}
	for(int i = 0; i < n; i++) {
		cout << arr[i];
	}
return 0; 
};