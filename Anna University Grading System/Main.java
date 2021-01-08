#include <stdio.h>
int main()
{
   int a;
  scanf("%d",&a);
  if(a==100)
    printf("S");
  else if(a>89&&a<100)
    printf("A");
   else if(a>79&&a<90)
    printf("B");
   else if(a>69&&a<80)
    printf("C");
   else if(a>59&&a<70)
    printf("D");
   else if(a>49&&a<60)
    printf("E");
   else if(a<50)
    printf("F");
   return 0;
}