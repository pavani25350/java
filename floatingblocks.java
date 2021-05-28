import java.util.Scanner;
public class floatingblocks {
    floatingblocks(int blocks)
    {
      int arr[]= new int[blocks];     
      for(int i=1;i<=blocks;i++)     
      {
        arr[i-1]=i;            
      }
      fun(arr);
    }
    void fun(int even[])
    {
      int count=0;
      for(int i=0;i<even.length;i++){      //1 2 3 4 5 6 7 8 9 10 11  12 13 14    2 4 6 
        if (i%2!=0)                          //0 2 0 4 0 6 0     2 4 6 8 10 12 14 16 18 2
        count+=1;    //1
      } 
      int b[]=new int[count];
      int a=0;
      for(int j=0;j<even.length;j++)
      {
        if (j%2!=0)
        b[a++]=even[j];     //4 8 12 16 20 8 16 
      }
        if (b.length==1)
        System.out.println("Element is "+b[0]);
        else 
        fun(b);   //2 4 6
    }

 public static void main(String args[])
 {
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter no. of blocks");
     int n=sc.nextInt();
     floatingblocks obj=new floatingblocks(n);

 }
    
}


/* There are N floating blocks in a pond .They are arranged in a straight line .Each block has it's own value 
Blocks at the odd positions(initial position is considered as 1)get submerged under water .You must shift the remaining blocks to 
the left by one position .So that only one block is left floating 
Sample input : 4
sample output : 4
Description : The odd positioned blocks 1,3 are submerged,Remaining blocks are 2,4.Again after removing odd positions 4 is remained so output is 4 */
