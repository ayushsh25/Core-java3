import java.util.Scanner;

class Demo83{

void Show(){

Scanner sc = new Scanner(System.in);

int i,n,j,c=0;

System.out.println("enter all prime number ");

n=sc.nextInt();

for(i=1 ; i<=n ; i++)
{
c=0;
for(j=2 ; j<=i/2 ; j++)
{
if(i%j == 0)
{
c++;
break;
}

}

if(c == 0)
{
System.out.println(i);
}
}

}

public static void main(String [] args){

Demo83 prime = new Demo83();

prime.Show();

}

}