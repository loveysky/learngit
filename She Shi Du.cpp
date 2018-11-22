#include <stdio.h>
float A(float f)
{
	float c;
	c=(f-32)/1.8;
	return (c);
 } 
 int main()
 {
 	float a,i;
 	for(i=32;i<=100;i=i+4)
 	{
 		a=A(i);
 		printf("f=%.2lf \t",i);
 		printf("c=%.2lf \n",a);
	 }
	 return 0;
 	
 }
