#include<stdio.h>
void Encrypted(char str[],char stg,int push){
	for (int i = 0; str[i] != '\0'; i++) {
		stg = str[i];

		if (stg >= 'a' && stg <= 'z') {
			str[i] = ((str[i] - 'a') + push) % 26 + 'a';

		}
	}
}
void Decryption(char str[], char stg, int push) {
	for (int i = 0; str[i] != '\0'; i++) {
		stg = str[i];

		if (stg >= 'a' && stg <= 'z') {
			str[i] = ((str[i] - 'z') - push) % 26 + 'z';

		}
	}
}
int main()
{
	char str[100] = {"im a bozyx"}, stg=str[0];

	Encrypted(str, stg, 3);
	printf("Encrypted str: %s\n", str);

	Decryption(str, stg, 3);
	printf("Decryption str: %s\n", str); 
	return 0;
}