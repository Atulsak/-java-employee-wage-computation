package com.add;

import java.util.ArrayList;




public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
  // add 
		list.add("abc");
		list.add("efg");
	    list.add("xyz");
	    
	    System.out.println("list ="+list);
	    list.add(0,"f");
        System.out.println("Adding an element in 2nd index :: " +list);

        
	}

}
