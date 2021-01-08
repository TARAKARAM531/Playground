#include <stdio.h>
int main()
{
   int a;
  int b;
  scanf("%d %d",&a,&b);
  int c;
  c= a%b;
  int d;
  d=a/b;
  printf("The number of students in each team is %d and left out is %d",d,c);
   return 0;
}