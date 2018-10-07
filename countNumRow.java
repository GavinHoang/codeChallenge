
public class countNumRow {

	public static void main(String[] args)
	{
		int[] a = {5, 4, 3, 6, 1, 8, 9, 2};
		int[] a1 = {2, 4, 6, 1};
		int[] a2 = {5, 4, 3, 6, 1};
		System.out.println(solution(a) + " ");
		//System.out.println(a.length);
		
	}
	
	 public static int solution(int[] A) {
	        // write your code in Java SE 8
		 int row = 0;		 
		 for(int i = 0; i < A.length; i++)
		 {
			 int mark = 0;
			 //System.out.println(i);
			 for(int j = 0; j < i; j++)		 
				 if(A[i] > A[j])
					 mark++;	 
			
			 if(mark == i)
				 row++;
			 
				 
		 }
		 
		 return row;
	    }
}

