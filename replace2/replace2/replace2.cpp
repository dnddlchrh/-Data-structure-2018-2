#include<stdio.h>
void replace(char str[],int num,char nC) {
	printf("원래 문자열 : %s\n", str);
	str[num - 1] = nC;
	printf("바뀐 문자열 : %s\n", str);
}

int main()
{
	char str[100];
	int num;
	char nC;
	scanf("%s %d %c", str, &num, &nC);

	replace(str,num, nC);
	return 0;
}//번수를 찾아 변경
/*void replace(char str[],char oC,char nC) {
for(int i=0;str[i]='\0';i++)
{
if(str[i]=oC)
str[i]=nC;
}
}

int main()
{
	char str[100];
	char nC,oC;
	scanf("%s %c %c", str, &Oc, &nC);
	printf("현재 문장 : %s\n",str);
	replace(str, oC, nC);
	printf("바뀐 문장 : %s\n",str)
	return 0;
	}
	문자를 찾아 변경*/