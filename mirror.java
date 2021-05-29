import java.util.Scanner;
class mirror
{ 
  static char mrstr(char x)
 { 
   int a=(int)x;
   int b=a-97;
   int c=122-b;
   return (char)c;
 }  
  public static void main(String args[])
  {
   String str;
   String st=new String(" ");
   Scanner sc=new Scanner(System.in);
   System.out.println(" string :");
   str=sc.next();
   int n=str.length();
   int i;
   for(i=0;i<n;i++)
   { 
    st=st+mrstr(str.charAt(i));
    }
    System.out.println("string:" + st);
  }
}

/* print the mirror image of the given lowercase string zbay . 
Note : mirror image doesnot mean reverse(The mirror image of a is z , b is y , c is x) */