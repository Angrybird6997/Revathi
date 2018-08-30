import java.io.*;
import java.util.*;
class Q
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int sum=0;
        int arr[]=new int[a];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
        for(int i=0;i<=b-1;i++)
        {
             sum+=arr[i];
        }
        System.out.print(sum);
      
    }
}

