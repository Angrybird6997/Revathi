import java.io.*;
import java.util.*;
class oddoreven
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if((a & 1)==0)//if((a/2)*2==a)
        {
            System.out.print("even");
        }
        else
        {
            System.out.print("odd");
        }
    }
}
