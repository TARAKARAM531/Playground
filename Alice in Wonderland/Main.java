#include <stdio.h>
int main()
{
  int a,r,s;
  scanf("%d",&a);
  r=a%10;
  a=a/10;
  s=r+a;
  printf("Alice must go in path-%d",s);
   return 0;
}