package technicalPractice;

import java.util.Arrays;
import java.util.List;

public class HighestProduct {
	
	//The helpers repeat code unnecessarily, can be done during iteration through input	
	
	public static List<Integer> maxThree(int curr, List<Integer> max) {
		for (int i = 0; i < max.size(); i++) {
			if (curr > max.get(i)) {
				int j = max.size()-1;
				while (j > i) {
					max.set(j, max.get(j-1));
					j--;
				}
				max.set(i, curr);
				return max;
			}
		}
		return max;
	}
	public static List<Integer> minThree(int curr, List<Integer> min) {
		for (int i = 0; i < min.size(); i++) {
			if (curr < min.get(i)) {
				int j = min.size()-1;
				while (j > i) {
					min.set(j, min.get(j-1));
					j--;
				}
				min.set(i, curr);
				return min;
			}
		}
		return min;		
	}
	public static List<Integer> smallThree(int curr, List<Integer> small) {
		int currAbs = Math.abs(curr);
		for (int i = 0; i < small.size(); i++) {
			if (currAbs < Math.abs(small.get(i))) {
				int j = small.size()-1;
				while (j > i) {
					small.set(j, small.get(j-1));
					j--;
				}
				small.set(i, curr);
				return small;
			}
		}
		return small;			
	}
	
	public static int mult(List<Integer> ints) {
		int out = 1;
		for (int i = 0; i < ints.size(); i++) {
			out = out*ints.get(i);
		}
		return out;
	}

	public static int maxProd(List<Integer> ints) {
		//Could initialize to 3 first elements sorted according to min/max/smallest(abs)
		List<Integer> small = Arrays.asList(999999, 999998, 999997);
		List<Integer> max = Arrays.asList(-999999, -999998, -999997);
		List<Integer> min = Arrays.asList(999999, 999998, 999997);
		for (int i = 0; i < ints.size(); i++) {
			small = smallThree(ints.get(i), small);
			max = maxThree(ints.get(i), max);
			min = minThree(ints.get(i), min);	
		}
		int temp = Math.max(mult(small), mult(max));
		return Math.max(temp, (max.get(0)*min.get(0)*min.get(1)));
	}
	
	public static void main(String[] args) {
		List<Integer> a = smallThree(11, Arrays.asList(-2, 5, 9));
		List<Integer> b = smallThree(0, Arrays.asList(-2, 5, 9));
		List<Integer> c = smallThree(4, Arrays.asList(-2, 5, 9));
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
