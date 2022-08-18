package geekforgeeks;

public class MinValInArray {
	
	public static void main(String[] args) {
		int a []={1,2,5,6,3,7};  	
		getSmallest(a, a.length);
		
	}
	
	
	public static int getSmallest(int[] a, int total){  
		int temp;  
		for (int i = 0; i < total; i++)   {  
		            for (int j = i + 1; j < total; j++)   
		            	
		            {  
		    			System.out.println("a[i] a[j]"+ a[i]+"vs"+a[j] );
		    			//System.out.println("a[j] "+ a[j]);

		            	
		                if (a[i] > a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  

		       return a[0];  
		}  
	

}
