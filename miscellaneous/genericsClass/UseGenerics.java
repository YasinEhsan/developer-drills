package javaGenerics;

import java.util.ArrayList;

public class UseGenerics {
	public static void main(String args[]) {
		ArrayList<Integer> x = new ArrayList<>();
		ArrayList<String> y = new ArrayList<>();
		x.add(3);
		x.add(1);
		x.add(4);
		y.add("X");
		y.add("Y");
		y.add("Z");
		System.out.println(x.get(0) + y.get(2));
	}
}