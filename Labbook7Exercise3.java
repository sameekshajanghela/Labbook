package corejavalabbook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Labbook7Exercise3 {
	public static void main(String[] args) {
		Labbook7Exercise3 ui=new Labbook7Exercise3();
	    
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(8);
		list.add(9);
		list.add(10);
		Map<Integer,Integer> map=ui.getSquares(list);
		System.out.println(map);
		
		
	}
public static Map<Integer,Integer> getSquares(List<Integer> list) {
	HashMap<Integer,Integer> map=new HashMap<>();
	for(Integer a:list) {
		map.put(a,a*a);
	}
	return map;	
	}
}