//diffcult question for (for loop)

import java.util.Scanner;

class Demo69{

public static void main(String [] args){

Scanner sc = new Scanner(System.in);

int n,i,a,s=0;

System.out.println("enter the no. of elements");

n=sc.nextInt();

for(i=1 ; i<=n ; i++)
{

System.out.println("enter the no. of elements");

a=sc.nextInt();

s=s+a;

}

System.out.println(s);

}

}