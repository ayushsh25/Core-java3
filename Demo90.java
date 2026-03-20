class Demo90{

void Show(){

int i,j,c=1;

for(i=1 ; i<=5 ; i++)
{
for(j=1 ; j<=i ; j++)
{
System.out.print(c);

c=c+1;
}
System.out.println();
}

}

public static void main(String [] args){

Demo90 pattern = new Demo90();

pattern.Show();

}

}