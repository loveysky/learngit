#include <stdio.h>
int A(int x)
{
	int i,t;
	t=0;
	if(x==1)
	t=-1;
	else if(x==2)
	t=1;
	else if(x!=1 && x!=2)
	{
		for(i=2;i<x;i++)
		{
			if(x%i==0)
			break;
			if(i+1==x)
			t=1;
		}
	}
	return (t);
}
		int main()
		{
			int a,b;
			printf("please input a:(a>0) \n");
			scanf("%d",&a);
			b=A(a);
			if(b==-1)
			printf("%d�Ȳ���������Ҳ���Ǻ���\n",a);
			else if(b==1)
			printf("%d������\n",a);
			else if(b==0)
			printf("%d��������\n",a);
			return 0;
		}

