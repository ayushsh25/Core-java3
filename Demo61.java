import java.util.Scanner;

class Demo61{

public static void main(String [] args){

Scanner sc = new Scanner(System.in);

int n,i,f=1;

System.out.println("enter the value");

n=sc.nextInt();

for(i=1 ; i<=n/2 ; i++)
{
if(n%i == 0)
{
f=f*i; //multiply the number
}
}
System.out.println(f);

}

}
