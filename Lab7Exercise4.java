package corejavalabbook;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Lab7Exercise4 {

public static void main(String[] args) {
	 Lab7Exercise4 ui=new Lab7Exercise4();
	Map<Integer,Integer> map=new HashMap<>();
	map.put(101,89);
	map.put(102,78);
	map.put(103,99);
	HashMap<Integer,String> details=ui.getStudents( map);
	System.out.println(details);
}

public static HashMap<Integer,String> getStudents(Map<Integer,Integer> map) {
	HashMap<Integer,String> details=new HashMap<>();
	for(Entry<Integer, Integer> a:map.entrySet()) {
		if(a.getValue()>=90) {
			details.put(a.getKey(),"Gold");
		}else if(a.getValue()>=80) {
			details.put(a.getKey(),"Silver");
		}else if(a.getValue()>=70) {
			details.put(a.getKey(),"Bronze");
		}
		
	}
	return details;
}

}