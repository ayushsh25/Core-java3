import java.util.Scanner;

class Demo86{

void Show(){

Scanner sc = new Scanner(System.in);

int n,i,c=0;

System.out.println("enter the value");

n=sc.nextInt();

for(i=1 ; i<=n/2 ; i++)
{
if(n%i == 0)
{
c++;
}
}
if(c==1)
{
System.out.println("the no. is prime");
}
else 
{
System.out.println("the no. is not prime");
}
}

public static void main(String [] args){

Demo86 prime = new Demo86();

prime.Show();

}

}