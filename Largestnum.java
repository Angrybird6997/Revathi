import java.io.*;
import java.util.*;
class Q
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        if(a>b&&a>c)
        {
            System.out.print(a);
        }
        else if(b>c)
        {
            System.out.print(b);
        }
        else
        {
            System.out.print(c);
        }
        
        
    }
}
