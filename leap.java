import java.io.*;
import java.util.*;
class leap
{
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
int a = s.nextInt();
if((a%400==0)||(a%4==0)&&(a%100!=0)
{
System.out.print("leap year");
}
else
{
System.out.print("not a leap year");
}
}
}
