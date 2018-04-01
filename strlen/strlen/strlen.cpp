#include<stdio.h>
int strlen(char str[]){
	int length;
	for (length = 0; str[length] = '\0'; length++);
	return length;
}
int main() {
	char str[100];

	scanf_s("%s", str);
	printf("%s¿« ±Ê¿Ã : %d\n", str, strlen(str));
	return 0;
}
