package Java;

import java.util.Arrays;

public class BubbleSort {
public static void main(String[] args) {
	
	
	int[] arr= {12,32,41,2,4,56};
	
	// ascending order
//	for(int i=1;i<arr.length;i++) {
//		
//		for(int j=1;j<arr.length;j++) {
//			
//			if(arr[j-1]>arr[j]) {
//				int temp=arr[j-1];
//				 arr[j-1]=arr[j];
//				 arr[j]=temp;
//			}
//		}
//	}
//	System.out.println(Arrays.toString(arr));
//	
	
	//descending order
	for(int i=1;i<arr.length;i++) {
	
	for(int j=1;j<arr.length;j++) {
		
		if(arr[j-1]<arr[j]) {
			int temp=arr[j-1];
			 arr[j-1]=arr[j];
			 arr[j]=temp;
		}
	}
}
System.out.println(Arrays.toString(arr));
	
}
}
