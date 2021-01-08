#include <stdio.h>
int main()
{
   char a;
  scanf("%c",&a);
  if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
    printf("Vowel");
  else if((a>=97 && a<=123)||(a>=65&&a<=90))
    printf("Consonant");
  else 
    printf("Not an alphabet");
   return 0;
}
