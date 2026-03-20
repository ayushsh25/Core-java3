class Demo97{

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
System.out.print(j);
}
System.out.println();
}

}

public static void main(String []args){

Demo97 pattern = new Demo97();

pattern.Show();

}

}