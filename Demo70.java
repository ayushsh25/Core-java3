import java.util.Scanner;

class Demo70{

public static void main(String [] args){

Scanner sc = new Scanner(System.in);

int n,a,i,m=0;

System.out.println("enter the no. of elements");

n=sc.nextInt();

for(i=1 ; i<=n ; i++)
{

System.out.println("enter the no. of elements");

a=sc.nextInt();

if(a>m)

{
m=a;
}

}

System.out.println(m);

}

}
