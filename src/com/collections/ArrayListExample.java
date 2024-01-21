package com.collections;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {

//		Non-Generic Collections Data  Duplicate data can be stored
//		ArrayList al = new ArrayList();
//		al.add("Atom");
//		al.add("Atom");
//		al.add(23);
//		al.add(true);
//		al.add(34.64);
//		al.add(52.234f);
//		al.add(52.234f);
//		for (Object val : al) {
//			System.out.println(val);
//		}

//		Generic Collections stores only data of same type  homogeneous

		ArrayList<String> al = new ArrayList<String>();
		al.add("Atom");
		al.add("Proton");
		al.add("Electron");

		for (Object val : al) {
			System.out.println(val);
		}

	}

}
