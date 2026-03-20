class Demo102{

void Factorial(){

int i,n,f=1;

for(n=5 ; n>=1 ; n--)
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

Demo102 pattern = new Demo102();

pattern.Factorial();

}

}