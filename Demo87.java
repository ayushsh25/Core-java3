class Demo87{

void Show(){

int i,j;

for(i=1 ; i<=5 ; i++)
{
for(j=1 ; j<=i ; j++)
{
System.out.print(j);
}
System.out.println();
}

}

public static void main(String [] args){

Demo87 pattern = new Demo87();

pattern.Show();

}

}
