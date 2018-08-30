import java.io.*;
import java.util.*;
class comp2
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int fact=1;
        for(int i=1;i<=a;i++)
        {
            fact=fact*i;
        }
        System.out.print(fact);
    }
}
