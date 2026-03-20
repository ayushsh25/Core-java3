import java.util.Scanner;

class Demo63{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);

int n,i,s=0;

System.out.println("enter the value");

n=sc.nextInt();

for(i=1 ; i<=n/2 ; i++)
{
if(n%i== 0)
{
s=s+i;
}
}
 if(s==n)
{
System.out.println("the number is perfect ");
}
else
{
System.out.println("the number is imperfect ");
}
}

}


