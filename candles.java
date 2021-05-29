import java.util.Scanner;
public class candles {
    int count=0 ;

    public candles (int numb1 ,int myarray1[]){   
        for(int i=0;i<numb1;i++){        
            for(int j=i;j<numb1;j++){     
               for(int k=j;k<numb1;k++){
 
                if(myarray1[i]>myarray1[j] && myarray1[j]>myarray1[k])
                      count+=1;
            }
}
}
       System.out.println("Number of triplets "+count);   
}    
    public static void main(String[] args) {
        int numb;
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter number of elements in array");
        numb=sc.nextInt();
        int myarray[]=new int[numb];
       System.out.println("Elements of array are:");
          for(int i=0;i<myarray.length;i++)
        {
          myarray[i]=sc.nextInt(); 
        }
        
        candles obj1 = new  candles(numb,myarray);
    }         
}


/* You are given N canle triplets and the length of each candle is stored in an array A.
The candles will form a triplet if A[i]>A[j]>A[k] and i<j print the count of number of candle triplets */