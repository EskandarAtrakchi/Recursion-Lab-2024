package packageTest;


public class StartApp {

	public static void main(String[] args) {

        System.out.println("Result: " + power(2, 3));

        System.out.println("Result: " + powerIterative(2, 3));
        
        String testString = "abba";

        System.out.println("Is Palindrome: " + isPalindrome(testString));
    }
    
    public static int power(int x, int y) {
    	
        if (y == 0) {
            return 1;//because the exponent of 0 is 1 in all conditions
        } else {
            return x * power(x, y - 1);
        }
    }
    
    public static int powerIterative(int x, int y) {
        int result = 1;
        while (y > 0) {
            result *= x;//keep assigning the results to the result variable untill y > 0
            y--;//decrement 
        }
        return result;
    }
    
    public static boolean isPalindrome(String s) {
        if (s.length() <= 1) {//if the string is less or equal one char 
            return true;
        } else if (s.charAt(0) != s.charAt(s.length() - 1)) {//if the first char from the string does not equal the last
            return false;
        }
            return isPalindrome(s.substring(1, s.length() - 1));//use substring method 
        
    }
}
