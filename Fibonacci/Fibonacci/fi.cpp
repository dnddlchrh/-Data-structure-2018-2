#include<stdio.h>

int main()
{
	int n1, n2, num;
	printf("숫자를 세 개 입력하세요 예시(1 1 5)");
	scanf("%d %d %d", &n1, &n2, &num);
	for (int i = 0; i < num; i++)
	{
		int r = n1 + n2;
		printf("%d ", n1);
		n1 = n2;
		n2 = r;
	}

	return 0;
}
