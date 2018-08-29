import java.io.*;
import java.util.*;
class Q
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        char c ='@';
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
        {
            System.out.print("Vowel");
        }
        else
        {
            if((c>'a'&& c<='z')||( c>'A'&&c<='Z'))
        {
            System.out.print("consonant");
        }
            else
            {
            System.out.print("Invalid");
            }
        }
    }
}
