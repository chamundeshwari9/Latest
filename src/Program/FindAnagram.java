package Program;

import java.util.Arrays;

public class FindAnagram {
	
	public static boolean isAnagram(String s1 ,String s2)
	{
		String str1 = s1.replaceAll("\\s", "");
		String str2 = s2.replaceAll("\\s", "");
		if (str1.length()!=str2.length()) {
			
		
		return false;
		}
		else {
			char ch1[] = str1.toLowerCase().toCharArray();
			char ch2[] = str2.toLowerCase().toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			return Arrays.equals(ch1, ch2);
			
		}
		
	}
	
	public static boolean anagramString(String s1,String s2)
	{
		char[] charstring1 = s1.toCharArray();
		char[] charstring2 = s2.toCharArray();
		Arrays.sort(charstring1);
		Arrays.sort(charstring2);
		
		return Arrays.equals(charstring1, charstring2)
		;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isAnagram("LISTEN", "silent"));
	System.out.println(anagramString("TREAT", "TAERT"));

	}

}
