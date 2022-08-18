package review;

import java.util.function.Predicate;

public class SumOfArrayItems {
	
	public static void main(String[] args) {
		
		Integer[] my_numbers= {1,2,3,4,5};
		Integer totalScore=find_total(my_numbers);
		System.out.println(totalScore);
		
	}
	
	public static Integer find_total( Integer[] my_numbers ) {
		 //Insert your code here 
		int totalScore=0;
		
		if(null==my_numbers) {
			return totalScore;
	
		}
		else if(my_numbers.length==0) {
			return totalScore;
	
		}
		else {
			for (int i = 0; i < my_numbers.length; i++) {
				 //Predicate<Integer> pi= a->a%2==0;
				 Predicate<Integer> pi= SumOfArrayItems::isEven;
				 boolean isEven=pi.test(my_numbers[i]);
				 
				if(isEven==true) {
					totalScore=totalScore+1;
					System.out.println("total score when number is even "+ totalScore);

				}
				else {
					if (my_numbers[i]==5){
						totalScore=totalScore+5;
						System.out.println("total score when number is five "+ totalScore);
					}else {
						totalScore=totalScore+3;
						System.out.println("total score when number is odd "+ totalScore);	
					}

				}
			}
			return totalScore;
		}
		
		
	}

	
	  public static  boolean isEven(int number) {
		  boolean isEven=true;
		  
		  if(number%2==0) {
			  return isEven;
		  }else {
			  isEven=false;  
			  return isEven;

		  }
	  }
	

}
