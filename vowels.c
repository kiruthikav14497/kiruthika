#include<stdio.h>
int main()
{
char c;
printf("Enter the c");
scanf("%c",c);
if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
{
    printf("c is the vowel");
}
else
{
 printf("c is the consonant");
}
return 0;
}
