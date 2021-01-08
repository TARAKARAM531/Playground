#include <stdio.h>
int main()
{
   int a,b,c;
  scanf("%d %d",&a,&b);
  if (b==00){
  c=100-a;
  printf("%d",c);
    }
  else{ 
    if(a>b){
      c=100-(a-b);
      printf("%d",c);
    }
    else if(b>a){
      c=b-a;
      printf("%d",c);
    }
  }
 return 0;
}