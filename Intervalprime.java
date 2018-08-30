import java.io.*;
import java.util.*;
class comp2
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int count=0;
        for(int i=a;i<=b;i++)
        {
            for(int j=2;j<i;j++)
            {
            if(i%j==0)
            {
                count=0;
                break;
            }
            else
            {
                count=1;
            }
        }
        if(count==1)
        {
            System.out.println(i);
        }
        }
    }
}
