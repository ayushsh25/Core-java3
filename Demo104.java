class Demo104{

void Factorial(){

int i,n,f=1,sum=0;

for(n=5 ; n>=1 ; n--)
{
for(i=n ; i>=1 ; i--)
{
f=f*i;
}
sum=sum+f;

System.out.println(f);
f=1;

}

System.out.println(sum);

}

public static void main(String [] args){

Demo104 pattern = new Demo104();

pattern.Factorial();

}

}