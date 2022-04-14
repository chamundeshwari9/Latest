package Program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Ascending {
	

	public static void main(String[] args) {
		String s = "78900273647201813";
		List<Integer> l = new ArrayList<Integer>();
		for (int i = 0; i <s.length(); i++) {
			l.add(Integer.parseInt(String.valueOf(s.charAt(i))));
			
		}
		Collections.sort(l);
		for (Integer integer : l) {
			System.out.print(integer);
			
		}
		WebDriverManager.chromedriver().setup();
	}

}
