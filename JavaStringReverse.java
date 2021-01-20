package hackerrank;

public class JavaStringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A = normal string
		String A = "madamr";
		String B = A;
		String C = "";
		// C = reversed string
		int length = A.length();
		for(int i=length-1;i>=0;i--) {
			  C=C+B.charAt(i);
		}
	
		
		int count = 0;
		
		for(int b=length-1;b>=0;b--) {
			 if ( C.charAt(b) ==B.charAt(b)) {
				 count++;
			 }
			  
		}


		
		
		
		
		
   
		if (length == count) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

	}

	
	}


