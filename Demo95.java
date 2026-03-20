class Demo95{

void Show(){

int i,j;

for(i=1 ; i<=5 ; i++)
{
for(j=1 ; j<=5 ; j++)
{
System.out.print(j);
}
for(j=5 ; j>=1 ; j--)
{
System.out.print(j);
}

System.out.println();
}

}

public static void main(String [] args){

Demo95 pattern = new Demo95();

pattern.Show();

}

}