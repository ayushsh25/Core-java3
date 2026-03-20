import java.util.Scanner;

class Demo82{

void Show(){

Scanner sc = new Scanner(System.in);

int n,f=1,i;

System.out.println("enter the value");

n=sc.nextInt();

for(i=n ; i>=1 ; i--)

{

f=f*i;

}

System.out.println(f);

}

public static void main(String [] args){

Demo82 factorial = new Demo82();

factorial.Show();

}

}