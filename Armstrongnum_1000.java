import java.util.Scanner;
class Armstrongnum_1000
{
public static void main(String args[])
{
  int count =0;
  int sum = 0;
  for(int n = 0; n<=1000; n++)
{
  int temp = n;

  while(n!=0)
 { 
  int rem = n%10;
    count++;
    n = n/10;
 }
 n =temp;

 while(n!=0)
 {
  int a = n%10;
  sum = sum + (int)Math.pow(a,count);
  n = n/10;
 }

 if(temp == sum)
System.out.println(temp);
count = 0;
sum = 0;
n = temp;
}
}
}