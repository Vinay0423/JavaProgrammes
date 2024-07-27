package Java;

import java.security.KeyStore.Entry;
import java.util.HashMap;

public class DuplicateChar {
public static void main(String[] args) {
	
	HashMap<Character, Integer> map= new HashMap<Character, Integer>();
	
	String str= "javamava";
	char[] chr= str.toCharArray();
	
	for(int i=0;i<chr.length;i++) {
		for(int j=i+1;j<chr.length;j++) {
			if(chr[i]==chr[j]) {
				System.out.println("this characters are repeated "+ chr[i]);
				break;
			}
		}
	}
}
}
