#include <stdio.h>
int main()
{
   int a,b;
  scanf("%d %d",&a,&b);
  if(a==b)
    printf("%d and %d are equal",a,b);
  else if(a<b)
    printf("%d less than %d",a,b);
  else
    printf("%d greater than %d",a,b);
   return 0;
}