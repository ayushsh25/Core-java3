import java.util.Scanner;

class Demo62{

public static void main(String [] args){

Scanner sc = new Scanner(System.in);

int n,i,c=0;

System.out.println("enter the value");

n=sc.nextInt();

for(i=1 ; i<=n/2 ; i++)
{
if(n%i == 0)
{
c++; //cout the number
}
}

System.out.println(c);

}

}

