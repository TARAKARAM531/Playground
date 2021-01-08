#include <stdio.h>
int main()
{
   int a,b;
  float c,d;
  scanf("%d %d",&a,&b);
  scanf("%f",&c);
  d=a*b*(c/100);
   printf("%.2f",d);
   return 0;
}