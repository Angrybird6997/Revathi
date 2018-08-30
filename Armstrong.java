import java.io.*;
import java.util.*;
class Armstrong
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int num=s.nextInt();
       int number,temp,total=0;
        number=num;
        while(number!=0)
        {
            temp=number%10;
            total =total+temp*temp*temp;
            number=number/10;
        }
        if(total==num)
        {
            System.out.print("armstrong number");
        }
        else
        {
            System.out.print("not Armstrong number");
        }
    }
}
