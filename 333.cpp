#include<stdio.h>
#include<math.h>
int main()
{
	int a,b,c;
	printf("请输入三角形三边： \n");
	scanf("%d %d %d",&a,&b,&c);
	if(a+b<c||a+c<b||b+c<a)
	printf("不是三角形\n");
	else if(a*a+b*b==c*c||b*b+c*c==a*a||c*c+a*a==b*b)
	printf("直角三角形\n");
	else if (a==b && b==c && c==a)
	printf("等边三角形\n");
	else if (a==b || b==c || c==a)
	printf("等腰三角形\n");
	else
	printf("普通三角形\n");
	return 0;
 } 
