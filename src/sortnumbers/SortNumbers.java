package sortnumbers;
import java.util.Scanner;
import java.util.ArrayList;



public class SortNumbers {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        ArrayList<Integer> myNumbers = new ArrayList<>();
        
        int temp = 0;
        boolean end = false;
        while (end == false){
         System.out.println("Whats your number?");
            System.out.println("Type ,0, to end.");
         int num = input.nextInt();
            if (num != 0) {
               myNumbers.add(num);
            System.out.println(num);
            System.out.println(myNumbers); 
            }else{
            end = true;
            }
        }
        int n = myNumbers.size();
        System.out.println("");
        
        for (int i = 0; i < (n) ; i++) {
         
            for (int j = 1; j < (n - i); j++) {
                
                for (int k = 0; k < (n-i-1); k++) {
            
        
//                        System.out.print(myNumbers.get(i) + " ");
                        
                temp = myNumbers.get(j-1);
         } 
//                System.out.println("");
//                        System.out.println("");

                
                
                if (myNumbers.get(j-1) > myNumbers.get(j)) {
                    for (int l = 1; l < n; l++) {
                        
                    
                        
                    }
                    temp = myNumbers.get(j-1);
                    myNumbers.set((j-1),myNumbers.get(j));
                    myNumbers.set(j,temp);
                                      
                    
                System.out.println("");
                        System.out.println("");
                
                    
                } } 
        }
        
      System.out.println(myNumbers);
     System.out.println("Smallest:" + myNumbers.get(0));
     System.out.println("Largest :" + myNumbers.get(n-1));
     System.out.println("Middle  :" + myNumbers.get((n-1)/2));
}}
    

        
      
        
