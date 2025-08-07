 public class pattern9{
    public static void main (String[] args) {

    int n = 6; // number of row 

    for(int i = 1; i<=n; i++){         // outer  loop 
        for(int j = 1; j<=i; j++){     // inner loop
            int sum = i+j;          //  sum of i + j
            if(sum % 2 == 0) {   // Even
                System.out.print("1 ");           // print even Number
            }
            else{   
                System.out.print("0 ");      // print odd number
            }
        }
            System.out.println();       // line change
    }




    }
   }

