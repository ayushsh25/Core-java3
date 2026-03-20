import java.util.Scanner;

class Demo66{

public static void main(String [] args){

Scanner sc = new Scanner(System.in);

int n,i,s=0;

System.out.println("enter the value");

n=sc.nextInt();

for(i=1 ; i<=n/2 ; i++)
{
if(n%i == 0)
{
s=s+i;
}
}
if(n%2 == 0)
{
System.out.println("the number is even ");
}
else
{
System.out.println("the number is odd ");
}

}

}