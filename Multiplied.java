package technicalPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Multiplied {
	//in: [1, 3, 5, 2]
	//out: [3*5*2, 1*5*2, 1*3*2, 1*3*5]
	
	//All methods without division on purpose
	//Nested loop, inefficient
	public static List<Integer> Multiply2(List<Integer> a) {
		List<Integer> res = new ArrayList<Integer>();
		for (int i = 0; i < a.size(); i++) {
			int acc = 1;
			for (int j = 0; j < a.size(); j++) {
				if (i == j) {
				} else {
					acc = a.get(j) * acc;					
				}
			}
			res.add(acc);
		}
		return res;
	}
	public static List<Integer> Multiply(List<Integer> a) {
		List<Integer> res = new ArrayList<Integer>(Collections.nCopies(a.size(), 1));
		int acc = 1;
		int acc2 = 1;
		for (int i = 0; i < a.size()-1; i++) {
			acc = acc*a.get(i);
			acc2 = acc2*a.get(a.size()-i-1);
			res.set(i+1, acc*res.get(i+1));
			res.set(a.size()-i-2, acc2*res.get(a.size()-i-2));	
		}
		return res;
	}
	
	//unused, multiplies two arrays element-wise
	public static List<Integer> ArrayMul(List<Integer> a, List<Integer> b) {
		List<Integer> out = new ArrayList<Integer>();	
		if (a.size() != a.size()) {
			System.out.print("Equal array size necessary");
		} else {
			for (int i = 0; i < a.size(); i++) {
				out.add(a.get(i)*b.get(i));
			}
		}
		return out;
	}

}
