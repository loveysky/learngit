#include<stdio.h>
#include<math.h>
int main()
{
	int a,b,c;
	printf("���������������ߣ� \n");
	scanf("%d %d %d",&a,&b,&c);
	if(a+b<c||a+c<b||b+c<a)
	printf("����������\n");
	else if(a*a+b*b==c*c||b*b+c*c==a*a||c*c+a*a==b*b)
	printf("ֱ��������\n");
	else if (a==b && b==c && c==a)
	printf("�ȱ�������\n");
	else if (a==b || b==c || c==a)
	printf("����������\n");
	else
	printf("��ͨ������\n");
	return 0;
 } 
