package technicalPractice;

import java.util.HashMap;
import java.util.Map;

public class Fib {
	static Map<Integer, Integer> memo = new HashMap<Integer, Integer>();
		
		//Extremely slow
		public static int Fibb(int a) {
			if (a < 3) {
				return 1;
			} else {
				return Fibb(a-1)+Fibb(a-2);
			}
	
		}
		
		//Fast
		public static int FibMemo(int a) {
			if (memo.containsKey(a)) {
				return memo.get(a);
			}
			if (a < 3) {
				memo.put(a, 1);
				return 1;
			} else {
				int out = FibMemo(a-1)+FibMemo(a-2);
				memo.put(a, out);
				return out;
			}

		}
		
		//Fast
		public static int FibbTail(int a) {
			return FibbTail(a, 1, 1);
		}
		public static int FibbTail(int a, int curr, int prev) {
			if (a<3) {
				return curr;
			} else {
				return FibbTail(a-1, curr+prev, curr);				
			}
		}
		
		
		public static void main(String[] args) {
			System.out.println(FibMemo(60));

		}

	}