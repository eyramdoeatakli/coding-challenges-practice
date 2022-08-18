package twodarrays;

public class TwoDArrayDemo {
	
    public static void main(String[] args) {
        //2-d array initialised with values    
       int[][] intArray = { { 1, 2 }, { 3, 4 },{5,6}}; 
       //print the array
       System.out.println("Initialized Two dimensional array:");
       for (int i = 0; i < 3; i++) { 
           for (int j = 0; j < 2; j++) { 
           System.out.print(intArray [i][j] +" "); 
          // System.out.print( i+" "+j); 
           } 

           System.out.println(); 
       } 
   }

    public static void main1(String[] args) {
        //initialize 2-d array
int[][] myArray = { { 1, 2, 3 }, { 4, 5 } }; 
    System.out.println("length of array:" + myArray.length); //number of rows
    for(int i=0;i<myArray.length;i++)
    //length of each row
    System.out.println("length of 1D array(" + (i+1) +"):" + myArray[i].length);
    
    //myArray.length represents length of 2d array
    //myArray[i].length represents the length of each row
    
    }
    
    public static void main2(String[] args) {
        //two dimensional array definition  
        int[][] myarray = new int[3][3];
        //printing the 2-d array
        System.out.println("The two-dimensional array:");
        for (int i = 0; i <myarray.length; i++) {
            for (int j = 0; j <myarray [i].length; j++) {
                myarray[i][j] = j+1;                    //assign value to each array element
                System.out.print(myarray[i][j] + " ");
            }
            System.out.println("");
        }
    }

}
