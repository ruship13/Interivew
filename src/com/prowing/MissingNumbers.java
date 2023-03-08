package com.prowing;

public class MissingNumbers {

	public static void main(String[] args) {



	}
	
	public void num() {
		int a[] = {1,3,5,7};
		for(int i=0;i<a.length;i++) {
			for(int j =i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp =a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		int max =a[a.length-1];
		int j=0;
		for(int i=1;i<max;i++) {
			if(j<a.length&&i==a[j]);
		}
	}

}
