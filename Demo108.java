class Demo108{

public static void main(String [] args){

int i,j;

for(i=1 ; i<=5 ; i++)
{
for(j=1 ; j<=i ; j++)
{

if(i%2 ==1)
{
System.out.print(j%2);
}
else
{
System.out.print((j+1)%2);

}

}

System.out.println();

}

}

}