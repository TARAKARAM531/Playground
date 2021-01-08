#include <stdio.h>
int main()
{
  int a,b,c,d;
  float e,f;
  scanf("%d %d %d %d",&a,&b,&c,&d);
  e=a+c;
  f=b+d;
  printf("Binoy's house is located at (%.1f,%.1f)",e/2,f/2);
   return 0;
}