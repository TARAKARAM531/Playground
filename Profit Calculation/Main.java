#include <stdio.h>
int main()
{
  int x,p,b,c;
  scanf("%d %d %d",&x,&p,&b);
  c=(x*p)-(x*b)-100;
  printf("The profit obtained is Rs.%d",c);
   return 0;
}