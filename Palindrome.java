import java.util.Scanner;
public class Palindrome
{
public static void main(String args[])
{
String str,reverse="";
Scanner sc=new Scanner(System.in);
System.out.print("Enter a String:");
str=sc.nextLine();
int length=str.length();
for(int i=length-1;i>=0;i--)
reverse=reverse+str.charAt(i);
if(str.equals(reverse))
{
System.out.print(" is a Palindrome");
}
else{
System.out.print("not a Palindrome");
}
}
}

