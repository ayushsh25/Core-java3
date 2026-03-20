class Demo93{

void Show(){

int i,j;

for(i=1 ; i<=5 ; i++)
{
for(j=1 ; j<=(2*i-1) ; j++)
{
System.out.print(j);


}
System.out.println();
}

}

public static void main(String [] args){

Demo93 pattern = new Demo93();

pattern.Show();

}

}