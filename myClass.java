//This is the complete code used for the EveryDeveloper sample project on java arrays
//written by Izzy Pfander 

public class myClass {
    
     
     static String[] beatles = {"John", "Paul", "George", "Ringo"};
    
    // Function using java for loop 
    static void myFunction( String[] inputArray ){
        for (int i = 0; i < inputArray.length; i ++){
            System.out.println(inputArray[i]);
        }
    }
    
   
    //function to sort in ascending order 
    static void myBubbleSortAsc(String[] inputArray){
        for (int i = 0; i < inputArray.length - 1; i ++) {
            for (int j = 0; j < inputArray.length - 1 - i ; j ++)
                if(inputArray[j].compareTo(inputArray[j + 1] ) > 0){
                    //swap elements j and j+1
                    String temp = inputArray[j]; 
                    inputArray[j] = inputArray[j+1];
                    inputArray[j+1] = temp; 
            }
        } 
        //prints the sorted array 
        for (int i = 0; i < inputArray.length; i ++){
            System.out.println(inputArray[i]);
        }
    }
    
    //function to sort in descending order 
    static void myBubbleSortDesc(String[] inputArray){
        for (int i = 0; i < inputArray.length - 1; i ++) {
            for (int j = 0; j < inputArray.length - 1 - i ; j ++)
                if(inputArray[j].compareTo(inputArray[j + 1] ) < 0){
                    //swap elements j and j+1
                    String temp = inputArray[j]; 
                    inputArray[j] = inputArray[j+1];
                    inputArray[j+1] = temp; 
            }
        } 
        //prints the sorted array 
        for (int i = 0; i < inputArray.length; i ++){
            System.out.println(inputArray[i]);
        }
    }
    
    public static void main(String[] args) {
    //prints the array using for loop
    System.out.println("Here is the array printed:");
    myFunction(beatles);
   
    
    //sorts alphabetically and then prints 
    System.out.println("\nHere is the array printed in alphabetical order:");
    myBubbleSortAsc(beatles);
  
    //sorts reverse alphabetically and then prints 
    System.out.println("\nHere is the array printed in reverse alphabetical order:");
    myBubbleSortDesc(beatles);
        
   
  }
}
