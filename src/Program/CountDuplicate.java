package Program;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountDuplicate {
	public static void duplicateCharacter (String str)
	{
		if (str==null) {
			System.out.println("Null String");
			
		}
		if (str.isEmpty()) {
			System.out.println("Empty string");
			
		}
		if (str.length()==1) {
			System.out.println(str);
			
		}
		if (str.length()>1) {
					
		char[] words = str.toCharArray();
		Map<Character, Integer>charMap = new HashMap<Character , Integer>();
		for (char c : words) {
			if (charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c)+1);
				//charMap.remove(c);
			}
			else {
				charMap.put(c, 1);	
			}	
			}
		Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
		for (Map.Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue()>1) {
				System.out.println(entry.getKey() + " " + entry.getValue());	
			}
		}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		duplicateCharacter("test");

	}

}
