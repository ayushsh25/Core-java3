import java.util.Scanner;

class Demo105{

void Show(){

Scanner sc = new Scanner(System.in);

int a,b,i,n,c=0,j;

System.out.println("enter the value");

a=sc.nextInt();
b=sc.nextInt();

for(n=a ; n<=b ; n++)
{
for(i=1 ; i<=n ; i++)
{
c=0;
for(j=2 ; j<=i ; j++)
{
if(i%j==0)
{
c++;

}

}

if(c==0)
{
System.out.println("enter the prime number is "+i);

c=0;
}

}
}

} 

public static void main (String [] args){
Demo105 prime = new Demo105();

prime.Show();

}

}