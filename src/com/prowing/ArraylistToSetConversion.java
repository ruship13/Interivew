package com.prowing;
import java.util.*;

public class ArraylistToSetConversion {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("apple");
        arrayList.add("banana");
        arrayList.add("cherry");
        arrayList.add("banana");
        System.out.println(arrayList);
        HashSet<String> s1 = new HashSet<>(arrayList);
        System.out.println(s1);
        

	}

}
