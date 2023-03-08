package com.prowing;

import java.util.Arrays;
		public class Remove_zero {
			public static void main(String[] args) {
				int[] a = new int [] {1,0,3,67,10,54,33, 0, 0, 44, 0}; //[0, 0, 1, 3, 10, 54, 67]

	//			Arrays.sort(arr1);//+ [0, 0, 1, 3, 10, 54, 67]
	//			System.out.println(Arrays.toString(arr1));
				
				int count=0;
				for(int i=0; i<a.length;i++ ) {
					
					if(a[i]==0) {
						count++;
				        }
					}
				System.out.println(count);
				
				int[] newarr = new int[a.length-count];
				
				int conc = 0;
				for (int i=0; i<a.length; i++) {
					if (a[i]!=0) {
						newarr[conc++]=a[i];}
				}
				System.out.println(Arrays.toString(newarr));
				System.out.println("Original Length is ----> " + a.length);
				System.out.println("new Length is ----> " + newarr.length);	
			
			
			}
			}
		

	


