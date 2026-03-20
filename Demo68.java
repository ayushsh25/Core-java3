import java.util.Scanner;

class Demo68{

public static void main(String [] args){

Scanner sc = new Scanner(System.in);

int n,i,s=0,c=0;

System.out.println("enter the value");

n=sc.nextInt();

for(i=1 ; i<=n/2 ; i++)
{
if(n%i == 0)
{
s=s+i;
}
}
for(i=s/2 ; i>=1 ; i--)
{
c++;
}
System.out.println(c);
}
}