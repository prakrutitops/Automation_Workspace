package com.a1310;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx 
{
	public static void main(String[] args) {
		
		HashMap<String,String> map = new HashMap<>();
		map.put("a", "101");
		map.put("b", "102");
		map.put("c", "103");
		map.put("d", "104");
		
		//System.out.println(map);
		
		//foreach loop
		for(Map.Entry<String,String>m: map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
