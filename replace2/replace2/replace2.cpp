#include<stdio.h>
void replace(char str[],int num,char nC) {
	printf("���� ���ڿ� : %s\n", str);
	str[num - 1] = nC;
	printf("�ٲ� ���ڿ� : %s\n", str);
}

int main()
{
	char str[100];
	int num;
	char nC;
	scanf("%s %d %c", str, &num, &nC);

	replace(str,num, nC);
	return 0;
}//������ ã�� ����
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
	printf("���� ���� : %s\n",str);
	replace(str, oC, nC);
	printf("�ٲ� ���� : %s\n",str)
	return 0;
	}
	���ڸ� ã�� ����*/