package corejavalabbook;

import java.util.Arrays;

public class Lab7Exercise5 {
public static void main(String[] args) {
	int [] arr= {12,74,78,9,23};
	System.out.println(getSecondSmallest(arr));
}
public static int getSecondSmallest(int [] arr) {
	Arrays.sort(arr);
	return arr[1];
}
}
