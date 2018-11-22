#include <stdio.h>
int A(int x)
{
	int i,t;
	t=1;
	for(i=1;i<=x;i++)
	{
		t=t*i;
	}
	return (t);
 } 
 int main()
 {
 	int m,n,a,b,c;
 	printf("please input m and n: \n");
 	scanf("%d%d",&m,&n);
 	a=A(m);
 	b=A(m-n);
 	c=a/b;
 	printf("result is %d\n",c);
 	return 0;
 	
 	
 }
