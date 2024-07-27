package Java;

import java.security.KeyStore.Entry;
import java.util.HashMap;

public class DuplicateCharCount {
public static void main(String[] args) {
	
	HashMap<Character, Integer> map= new HashMap<Character, Integer>();
	
	String str= "javamava";
	char[] chr= str.toCharArray();
	
	for(char c: chr) {
		if(! map.containsKey(c)) {
			map.put(c, 1);
		} else {
		int count=	map.get(c);
		map.put(c, count+1);
		}
	}
	
	for(java.util.Map.Entry<Character, Integer> p: map.entrySet()) {
		
		System.out.println(p.getKey()+" "+ p.getValue());
	}
}
}
