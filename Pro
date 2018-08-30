import java.io.*;
import java.util.*;
class comp2
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int count=0;
        for(int i=2;i<a;i++)
        {
            if(a%i==0)
            {
                count++;
                break;
            }
        }
        if(count==0)
        {
            System.out.print("prime no");
        }
        else
        {
            System.out.print("not prime no");
        }
    }
}
