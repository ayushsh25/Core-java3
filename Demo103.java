class Demo103{

void Factorial(){

int i,n,f=1;

for(n=1 ; n<=7 ; n=n+2)
{
for(i=n ; i>=1 ; i--)
{
f=f*i;
}

System.out.println(f);
f=1;

}

}

public static void main(String [] args){

Demo103 pattern = new Demo103();

pattern.Factorial();

}

}