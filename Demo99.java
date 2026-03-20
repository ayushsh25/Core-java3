class Demo99{

void Show(){

int i,j;

for(i=1 ; i<=5 ; i++)
{
for(j=4 ; j>=i ; j--)
{
System.out.print(" ");
}
for(j=1 ; j<=i ; j++)
{
System.out.print("*");
}
for(j=i-1 ; j>=1 ; j--)
{
System.out.print("*");
}
System.out.println();
}

}

public static void main(String [] args){

Demo99 pattern = new Demo99();

pattern.Show(); 

}

}