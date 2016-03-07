package technicalPractice;

import java.util.ArrayList;
import java.util.List;

public class LineBreak {

	public static List<String> LineBreaker(String s, int brk) {
		List<String> out = new ArrayList<String>();
		while (s.length() > brk) {
			if (s.charAt(brk) == ' ' || s.charAt(brk-1) == ' ') {
				out.add(s.substring(0, brk));
				s = s.substring(brk);
			}else if (s.charAt(brk-2) == ' ') {
				out.add(s.substring(0, brk-1));
				s=s.substring(brk-1);
			}
			else {
				out.add(s.substring(0, brk-1)+'-');
				s=s.substring(brk-1);
			}
		}
		out.add(s);
		System.out.println(out);
		return out;
	}

}
