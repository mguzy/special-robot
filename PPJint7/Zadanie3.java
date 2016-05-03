//Zadanie3
public class Zadanie3{
	
	public static void main(String[] args){
		
		char[] p1 = "abccba".toCharArray();
		char[] p2 = "abczaazcba".toCharArray();
		char[] p3 = "12afbczcbfa21".toCharArray();
		char[] np1 = "1abccba2".toCharArray();
		char[] np2 = "sdabccbasd".toCharArray();
		char[] np3 = "dsagdsgasde".toCharArray();
		
		System.out.println(isPalindrome(p1));
		System.out.println(isPalindrome(p2));
		System.out.println(isPalindrome(p3));
		System.out.println(isPalindrome(np1));
		System.out.println(isPalindrome(np2));
		System.out.println(isPalindrome(np3));
	}
	
	private static boolean isPalindrome(char[] array){
		
		int n = array.length;
		
		for(int i=0; i<n/2; i++)
			if(array[i]!=array[n-i-1])
				return false;
			
		return true;
	}
}