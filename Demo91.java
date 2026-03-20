class Demo91{

void Show(){

int i,j,c=2;

for(i=2 ; i<=6 ; i++)
{
for(j=2 ; j<=i ; j++)
{
System.out.print(c);

c=c+2;
}
System.out.println();
}

}

public static void main(String [] args){

Demo91 pattern = new Demo91();

pattern.Show();

}

}
