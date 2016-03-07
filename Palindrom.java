package technicalPractice;

public class Palindrom {
    
	//Builtin solution
    static public boolean isPalindrom(String s) {
    	String s2 = new StringBuilder(s).reverse().toString();
    	if (s2.equals(s)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    //Manual reversion
    static public boolean isPalindrom2(String s) {
    	char[] s2 = s.toCharArray();
    	
    	for (int i = 0; i < s2.length/2; i++ ) {
    		char temp = s2[i];
    		s2[i] = s2[s2.length - i - 1];
    		s2[s2.length - i - 1] = temp;
    	}
    	String res = new String(s2);
    	if (res.equals(s)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    //Can compare first to last element, second to second to late, etc.
    //Completes in at most n/2 steps
}