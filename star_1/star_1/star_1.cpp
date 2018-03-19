#include<stdio.h>
void star1(int i);
int main()
{
	for (int i = 0; i < 5; i++)
	{
		{
			star1(i);
		}
		printf("\n");
	}

}
void star1(int i) {
	for (int j = 0; j <= i + 10; j++)
	{
		printf("*");
	}
}