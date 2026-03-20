import java.util.Scanner;

class Demo67{

public static void main(String [] args){

Scanner sc = new Scanner(System.in);

int n,i,s=0,f=1;

System.out.println("enter the value");

n=sc.nextInt();

for(i=1 ; i<=n/2 ; i++)
{
if(n%i == 0)
{
s=s+i;
}
}
for(i=s ; i>=1 ; i--)
{
f=f*i;
}
System.out.println(f);
}
}