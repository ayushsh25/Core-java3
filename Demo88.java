class Demo88{

void Show(){

int i,j;

for(i=1 ; i<=5 ; i++)
{
for(j=1 ; j<=i ; j++)
{
System.out.print("* ");
}
System.out.println();
}
}

public static void main(String [] args){

Demo88 pattern = new Demo88();

pattern.Show();

}

}